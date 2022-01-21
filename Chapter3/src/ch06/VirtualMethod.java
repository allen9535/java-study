package ch06;

public class VirtualMethod {

  // 가상 메서드(Virtual Method) 원리
  // 가상 메서드 테이블(Virtual Method Table)에서 해당하는 메서드에 대한 주소를 가지고 있다.
  // 재정의된 경우, 재정의된 메서드 주소를 가리킨다.

  // 이전 Customer 클래스와 VIPCustomer 클래스를 떠올려보자.
  // Customer 클래스의 가상 메서드 테이블에는 재정의된 메서드 calcPrice와,
  // 재정의되지 않은 showCustomerInfo 메서드가 있다.
  // calcPrice의 메서드 주소를 0xFF00FFAA라 가정하고,
  // showCustomerInfo 메서드 주소를 0x112233AA라 가정하자.
  // 이 때 Customer 클래스의 calcPrice 메서드는 Customer 클래스의 calcPrice를,
  // Customer 클래스의 showCustomerInfo 메서드는 Customer 클래스의 showCustomerInfo를 가리킨다.

  // VIPCustomer 클래스의 가상 메서드 테이블에는 재정의된 메서드 calcPrice와,
  // 재정의되지 않은 showCustomerInfo 메서드, 하위 클래스에서 추가된 getAgentID 메서드가 있다.
  // 이 클래스의 calcPrice의 메서드 주소는 Customer 클래스의 calcPrice 메서드 주소와 다르고,(0x00335577)
  // showCustomerInfo 메서드 주소는 Customer 클래스의 showCustomerInfo 메서드 주소와 같다.(0x112233AA)
  // getAgentID는 새로 추가된 메서드이므로, 완전히 새 주소를 가리킨다.(0x8899BB33)

  // 정리하자면,
  // 재정의된 메서드는 서로 다른 주소를 가리키고,
  // 재정의되지 않은 메서드는 서로 같은 주소를 가리킨다고 할 수 있다.
  // Customer 클래스
  // calcPrice(재정의) --> Customer 클래스의 calcPrice()
  // showCustomerInfo(재정의되지 않음) --> Customer 클래스의 showCustomerInfo()
  // VIPCustomer 클래스
  // calcPrice(재정의) --> VIPCustomer 클래스의 calcPrice()
  // showCustomerInfo(재정의되지 않음) --> Customer 클래스의 showCustomerInfo()
  // getAgentID(새로 추가됨) --> VIPCustomer 클래스의 getAgentID()

}