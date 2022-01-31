package ch15.domain.userinfo.dao.oracle;

import ch15.domain.userinfo.UserInfo;
import ch15.domain.userinfo.dao.UserInfoDao;

// UserInfoDao 인터페이스 구현: Oracle 버전 dao
public class UserInfoOracleDao implements UserInfoDao {

  @Override
  public void insertUserInfo(UserInfo info) {
    System.out.printf("insert into ORACLE DB userId = %s\n", info.getUserId());
  }

  @Override
  public void updateUserInfo(UserInfo info) {
    System.out.printf("update into ORACLE DB userId = %s\n", info.getUserId());
  }

  @Override
  public void deleteUserInfo(UserInfo info) {
    System.out.printf("delete from ORACLE DB userId = %s\n", info.getUserId());
  }

}