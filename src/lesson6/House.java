package lesson6;

//1. ЭТО НЕ ОБЬЕКТ!!!! Это просто чертеж будущего обьекта(ов)
class House {
    //Состояние
    int cost;
    String color;
    int age;
    String address;
    int floor;

    //Поведение(Method)
/*    тип_возвращаемого_значения название(параметры){
        логика
    }*/

    String getAllInformationAboutHouse(){
        String result = "Цена: " + cost + "\nЦвет: " + color + "\nВозраст: " + age
                + "\nАдрес: " + address + "\nЭтаж: " + floor;
        return result;
    }

}
