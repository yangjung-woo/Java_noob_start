package variable;
// 자바 언어는 클래스는 대문자로 시작하고  , 낙타 표기법에 의해  Class yee => ClassYee 이렇게 표기된다
// 변수는 첫 글자가 소문자
public class Var8 {
    // 정수를 저장하는 다양한 종류
    byte b = 127; //-128~127
    short s = 32767;// -32767~32767
    int i = 2147483647; // -2147483647~ 2147483647
    long l = 923372036854775807L;// 아무튼 큼

    float f = 10.0f;
    double d; // 실무에서 거의 double 를 사용함
    /*
        최적화 및 형의 부적합으로 인해 byte , short float , char은 사용하지 않는다
     */

}
