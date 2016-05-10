package cursevoicelib.helpers;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.StringTokenizer;
import org.apache.http.cookie.Cookie;
import org.apache.http.impl.client.BasicCookieStore;
import org.apache.http.impl.cookie.BasicClientCookie;

public class CookieHelper {
    private BufferedReader buffreader;
    private String filePath;
    private String fileName;

    /**
     * Constructs a new CookieHelper instance containing the specified path for<br>
     * file where cookies will be stored permanently
     * 
     * @param filePath
     *            Container folder path
     * @param fileName
     *            Name of file where cookies will be save
     */
    public CookieHelper(String filePath, String fileName) {
        this.filePath = filePath;
        this.fileName = fileName;
    }

    /**
     * <h3>writeCookieTofile(Cookie cookie)</h3> Write cookie to specified file <br>
     * You should already had to specify file and path in the constructor
     * 
     * @param cookie
     *            Cookie to store
     */
    public void writeCookieTofile(Cookie cookie) {
        /*
         * All blank entries will be replaced with the * character. In addition,
         * each line of the file is separated by the # character Optionally you
         * can encrypt the cookie value to increase security
         */

        String SEPARATOR = "#";
        String name = cookie.getName();
        String value = "*";
        if (cookie.getValue() != null && !cookie.getValue().contentEquals(""))
            value = cookie.getValue();

        try {
        } catch (Exception e1) {
            e1.printStackTrace();
        }

        String domain = "*";
        if (cookie.getDomain() != null)
            domain = cookie.getDomain();
        String path = "*";
        if (cookie.getPath() != null)
            path = cookie.getPath();
        int version = cookie.getVersion();
        String ver = String.valueOf(version);
        String expired = "*";
        if (cookie.getExpiryDate() != null
                && !cookie.getExpiryDate().toString().contentEquals(""))
            expired = cookie.getExpiryDate().toString();

        File dirPath = new File(filePath);
        File nameFile = new File(fileName);
        File file = new File(dirPath + File.separator + nameFile);
        try {

            BufferedWriter writer = new BufferedWriter(new FileWriter(file,
                    true));
            writer.write(name);
            writer.write(SEPARATOR);
            writer.write(value);
            writer.write(SEPARATOR);
            writer.write(domain);
            writer.write(SEPARATOR);
            writer.write(path);
            writer.write(SEPARATOR);
            writer.write(ver);
            writer.write(SEPARATOR);
            if (expired != null)
                writer.write(expired);
            if (expired != null)
                writer.write(SEPARATOR);
            writer.newLine();
            writer.flush();
            writer.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    /**
     * <h3>retrieveCookie(BasicCookieStore store)</h3> Retrieve all cookies from
     * file and store those to specified cookiestore
     * 
     * @param store
     *            The cookiestore you want to fill with the cookies
     */
    public void retrieveCookie(BasicCookieStore store) {
        int i = 0;
        String line;
        BasicClientCookie cookies;
        String name = null;
        String value = null;
        String domain = null;
        String path = null;
        String expired = null;
        String version = null;
        File dirPath = new File(filePath);
        File nameFile = new File(fileName);
        File file = new File(dirPath + File.separator + nameFile);

        InputStreamReader inputreader = null;
        try {
            inputreader = new InputStreamReader(new FileInputStream(file));

            buffreader = new BufferedReader(inputreader);

            while ((line = buffreader.readLine()) != null) {
                StringTokenizer tokens = new StringTokenizer(line, "#");
                i++;
                while (tokens.hasMoreTokens()) {
                    switch (i = tokens.countTokens()) {
                    case 6:
                        name = tokens.nextToken();

                        break;
                    case 5:
                        value = tokens.nextToken();
                        break;
                    case 4:
                        domain = tokens.nextToken();
                        break;
                    case 3:
                        path = tokens.nextToken();
                        break;
                    case 2:
                        version = tokens.nextToken();
                        break;
                    case 1:
                        expired = tokens.nextToken();
                        break;

                    }
                }
                cookies = new BasicClientCookie(name, value);
                if (value.contentEquals("*"))
                    cookies.setValue(null);
                cookies.setDomain(domain);
                cookies.setPath(path);
                cookies.setVersion(Integer.valueOf(version));
                cookies.setExpiryDate(getDate(expired));
                store.addCookie(cookies);
            }

        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public Date getDate(String date) {
        Date dateExpired = null;
        SimpleDateFormat DATE_FORMATTER = new SimpleDateFormat(
                "EEE MMM dd HH:mm:ss Z yyyy", Locale.US);
        try {
            if (!date.equals("*")) {
                dateExpired = DATE_FORMATTER.parse(date.replaceAll(
                        "\\p{Cntrl}", ""));
            }
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return dateExpired;
    }
    
    public void clearFile() {
        try {
            PrintWriter writer = new PrintWriter(new File(filePath + fileName));
            writer.print("");
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
