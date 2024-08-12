package behavior.nullobject.demo2;

import java.util.Optional;

public class Client {
    public static void main(String[] args) {
        Optional<Address> address1 = Optional.of(
                new Address(Optional.ofNullable(null),
                        Optional.of("Shanghai")));
        Optional<Office> office1 = Optional.of(new Office("OF1",address1));
        Optional<Company> company1 = Optional.of(new Company("Door Never Closed",office1));

        Optional<Company> company2 = Optional.of(new Company("no_office",Optional.empty()));

        // 不推荐这样使用
        if(company1.isPresent()){
            company1.get();
        }

        // 推荐使用ifPresent 方法 传入参数是consumer接口
        company1.ifPresent((a) -> {
            System.out.println(a);
        });

        company1.flatMap(Company::getOffice).flatMap(Office::getAddress).flatMap(Address::getCity).ifPresent(System.out::println);

        // 这样就不需要判断为空
        company2.flatMap(Company::getOffice).flatMap(Office::getAddress).flatMap(Address::getCity).ifPresent(System.out::println);

        Optional.empty().ifPresent(System.out::println);


    }
}
