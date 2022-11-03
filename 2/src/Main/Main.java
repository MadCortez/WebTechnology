package Main;

public class Main {
    private static final Presenter presenter = new Presenter();

    public static void main(String[] args) {
        presenter.getItems();

        System.out.print("Самый дешёвый по стоимости товар: ");
        System.out.println(presenter.calcMin().getPrice());
        System.out.print("Кол-во чайников: ");
        System.out.println(presenter.countPots());
    }
}
