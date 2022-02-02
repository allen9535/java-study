package ch15.domain.userinfo.dao;

import ch15.domain.userinfo.UserInfo;

// 인터페이스를 활용한 dao 구현
// DB에 회원 정보를 넣는 dao(data access object)를 여러 DB제품에서 지원될 수 있도록 구현한다.
// 환경 파일(db.properties)에서 데이터베이스 종류에 대한 정보를 읽어,
// 그 정보에 맞게 dao 인스턴스를 생성해 실행할 수 있게 한다.

// dao에서 제공되어야 할 메서드를 선언한 인터페이스
public interface UserInfoDao {

  void insertUserInfo(UserInfo info);
  void updateUserInfo(UserInfo info);
  void deleteUserInfo(UserInfo info);

}