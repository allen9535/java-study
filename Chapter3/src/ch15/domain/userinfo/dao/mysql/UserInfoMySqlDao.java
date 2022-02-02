package ch15.domain.userinfo.dao.mysql;

import ch15.domain.userinfo.UserInfo;
import ch15.domain.userinfo.dao.UserInfoDao;

// UserInfoDao 인터페이스 구현: MySql버전 dao
public class UserInfoMySqlDao implements UserInfoDao {

  @Override
  public void insertUserInfo(UserInfo info) {
    System.out.printf("insert into MYSQL DB userId = %s\n", info.getUserId());
  }

  @Override
  public void updateUserInfo(UserInfo info) {
    System.out.printf("update into MYSQL DB userId = %s\n", info.getUserId());
  }

  @Override
  public void deleteUserInfo(UserInfo info) {
    System.out.printf("delete from MYSQL DB userId = %s\n", info.getUserId());
  }

}