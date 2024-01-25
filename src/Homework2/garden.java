// Варинат 2
// Класс-контейнер - Оранжерея
// Абстрактный класс - Цветок
// Классы-наследники: Василек, Роза, Пион

package Homework2;

public class garden {
    private flower[] flowerList;
    private int size;

    public garden() {
        this.size = 10;
        this.flowerList = new flower[size];
    }

    public void addGardenList(flower newFlower, int position) {
        flowerList[position] = newFlower;
    }

    public void printFlowers() {
        for (int i = 0; i < 10; i++) {
            System.out.println(flowerList[i]);
        }
    }

}







