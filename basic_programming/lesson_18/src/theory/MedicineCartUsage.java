package theory;


/**
 *  класс создан для использования сервиса MedicineCart
 *  <p>
 *  класс MedicineCart создан для демонстрации перегрузки конструкторов класса
 */
public class MedicineCartUsage {
    public static void main(String[] args) {

        // по умолчанию, если класс не содержит конструкторов,
        // то используется пустой конструктор:
        // (легально до создания конструктора MedicineCart(String name))
        // MedicineCart ilyasCart = new MedicineCart();


        // как только в классе создается хотя бы один конструктор,
        // то конструктор без аргументов (конструктор по умолчанию)
        // перестает работать и теперь единственное, чем можно воспользоваться - созданый конструктор:
        MedicineCart ilyasCart = new MedicineCart("Ilyas");

        // теперь пользователь при создании экземпляра класса ОБЯЗАН указать имя,
        // но все остальные поля задаются до сих пор через геттеры и сеттеры:
        ilyasCart.setAge(32);
        ilyasCart.setGender("male");

        // Это не очень удобно, ведь можно указать сразу все при регистрации.
        // Для таких пользователей, которые хотят задать больше информации
        // при регистрации можно создать отдельные конструкторы:
        // (данный конструктор позволяет заполнить изначально два поля - имя и возраст,
        // таким образом в дальнейшем не придется использовать сеттер для возраста, чтобы заполнить это поле
        MedicineCart petrCart = new MedicineCart("Petr", 26);

        // в случае, если пользователь решил заполнить сразу всю возможную информацию,
        // у нас есть максимально развернутый конструктор, который учитывает максимальное количество
        // полей:
        MedicineCart mariaCart = new MedicineCart(28, 60, "Maria", "female", false);

        // таким образом в нашем приложении MedicineCart существует три конструктора:
        // - MedicineCart(String name)
        // - MedicineCart(String name, int age)
        // - MedicineCart(int age, double weight, String name, String gender, boolean isPregnant)

        // Если взглянуть на эти конструкторы, а точнее на их аргументы, то мы увидим, что нет ни одного конструктора,
        // который позволял бы зарегистрироваться в сервисе, не указав имя. То есть, полчается, что поле String name -
        // обязательное к заполнениб поле, без которого нельзя пользоваться сервисом.

    }

}
