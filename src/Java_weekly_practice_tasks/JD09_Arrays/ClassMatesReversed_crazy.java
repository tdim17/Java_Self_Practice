package Java_weekly_txt_practice_tasks.JD09_Arrays;

public class ClassMatesReversed_crazy {

    public static void main(String[] args) {

        String [] names = new String[10];

        names[0] = "Julian Moore";
        names[1] = "Ivan Perry";
        names[2] = "Petr Norris";
        names[3] = "Nina Stallone";
        names[4] = "Bobby Rourke";
        names[5] = "Tom Cruz";
        names[6] = "Charlize Theron";
        names[7] = "Sharon Stone";
        names[8] = "Tanya Mose";
        names[9] = "Dick Cheney";


        // System.out.println(Arrays.toString(names));

        String [] namesReversed = new String [names.length];

        for (int i = 0; i < names.length; i++) {

            // Вообще я думал, что нужно было реверсировать все слова т.е. типа Eroom Nailuj
            // но даже этот вариант трудно вообразить в голове!
            namesReversed[i] = names[i].substring(names[i].indexOf(" ")) + " " + names[i].substring(0, names[i].indexOf(" "));

            System.out.println(namesReversed[i]);
        }





    }


}
/*
6. Create a class named ClassMatesReversed_crazy and write a program with the following specifications:
6.1 Create an array of strings named classmates.
6.2 Store full names of 10 classmates.
6.3 Reverse each student's name and print them on separate lines.
*/
