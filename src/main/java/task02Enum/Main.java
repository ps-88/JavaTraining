package task02Enum;

public class Main {
    public static void main(String[] args) {

        HttpCodeEnum byHttpCode = HttpCodeEnum.findByHttpCode(345);
        byHttpCode.getHandler().handle();
    }
}
