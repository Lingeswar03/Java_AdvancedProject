package _02_04_before;

public class ClothingSite {

    public static void main(String[] args) {
        ShirtsItem shirtsItem = new ShirtsItem();
        checkoutItem(shirtsItem);

        JacketsItem jacketsItem = new JacketsItem();
        checkoutItem(jacketsItem);


    }

    static void checkoutItem(ClothingsItem item) {
        System.out.println("Item parchased: " + item.getName() + ", price" + item.getPrice());
    }
}
