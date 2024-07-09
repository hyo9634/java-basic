package day18.lombokEx;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@ToString
@RequiredArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = {"shopName"})   //클래스에 대한 equals(), hashCode() 2개의 객체가 존재할때, 서로 같은 객체인지 판단
@Builder
public class StoreDTO {

  @Setter
  private String shopName;
  //가게이름
  @ToString.Exclude
  private String shopTypeCode;  //가게 업종 코드
  private String shopTele;      //가게 전화번호
  private String shopType;      //업종명
  private String shopAddr;      //가게 주소

}
