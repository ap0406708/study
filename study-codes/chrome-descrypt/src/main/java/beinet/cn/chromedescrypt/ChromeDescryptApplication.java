package beinet.cn.chromedescrypt;

import beinet.cn.chromedescrypt.chromeTest.ChromeUserDataReader;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ChromeDescryptApplication {

    public static void main(String[] args) {
        String localStateFile = "D:/Local State"; // ������Կ�ļ�·��
        String localPwdDB = "D:/Login Data";      // �˺������sqlite�ļ�·��
        var result = new ChromeUserDataReader(localPwdDB, localStateFile).queryData();
        for (var item : result) {
            System.out.println(item);
        }
        //SpringApplication.run(ChromeDescryptApplication.class, args);
    }

}
