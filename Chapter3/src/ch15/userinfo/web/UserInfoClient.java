package ch15.userinfo.web;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import ch15.domain.userinfo.UserInfo;
import ch15.domain.userinfo.dao.UserInfoDao;
import ch15.domain.userinfo.dao.mysql.UserInfoMySqlDao;
import ch15.domain.userinfo.dao.oracle.UserInfoOracleDao;

// UserInfoDao 인터페이스를 활용하는 클라이언트 프로그램
public class UserInfoClient {

  public static void main(String[] args) throws IOException {
    // 같은 프로젝트 폴더에서 db.properties 파일을 찾는다.
    FileInputStream fis = new FileInputStream("db.properties");

    // 키와 밸류로 이루어진 값을 읽어들일 수 있는 객체 Properties
    Properties prop = new Properties();
    // FileInputSream에서 값을 읽는다.
    prop.load(fis);

    // FileInputStream에서 읽어온 값 중 DBTYPE에 해당하는 값을 반환한다.
    String dbType = prop.getProperty("DBTYPE");

    UserInfo info = new UserInfo();
    info.setUserId("leemo");
    info.setPassword("1q2w3e4r");
    info.setUserName("이모");

    UserInfoDao userInfoDao = null;
    if (dbType.equals("ORACLE")) {
      userInfoDao = new UserInfoOracleDao();
    } else if (dbType.equals("MYSQL")) {
      userInfoDao = new UserInfoMySqlDao();
    } else {
      System.out.println("DB Support ERROR");

      return;
    }

    userInfoDao.insertUserInfo(info);
    userInfoDao.updateUserInfo(info);
    userInfoDao.deleteUserInfo(info);
  }

}