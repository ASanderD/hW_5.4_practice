//Дан массив пар названий книг и авторов, необходимо привести каждую пару в строку вида: «Название книги» Имя Отчество Фамилия автора
//"Война и мир", "Лев Николаевич Толстой", "Преступление и наказание", "Федор Михайлович Достоевский", "Александр Сергеевич Пушкин", "Руслан и Людмила"

public class Main {
    public static void main(String[] args) {
        String[] books = {"Война и мир", "Лев Николаевич Толстой", "Преступление и наказание", "Федор Михайлович Достоевский", "Александр Сергеевич Пушкин", "Руслан и Людмила"};
        for (int i = 0; i < books.length; i++) {
            if (i % 2 == 0) {
                System.out.printf("\""+"%s"+"\", "+"%s%n",books[i],books[i+1]);
            }
        }
    }
}


