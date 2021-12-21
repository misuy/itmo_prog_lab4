import java.util.Scanner;

public class Lab3
{
    public static class NameReader
    {
        private static String readName(Scanner in) throws IllegalNameException
        {
            System.out.println("Введите имя друга Незнайки: ");
            String friendName = in.nextLine();
            if (friendName.equals("Незнайка") | friendName.equals("Пилюлькин") | friendName.equals("Ларимар")) throw new IllegalNameException();
            else return(friendName);
        }

        public static String getFriendName(Scanner in)
        {
            String friendName;
            try
            {
                friendName = NameReader.readName(in);
            }
            catch(IllegalNameException e)
            {
                System.out.println(e.getMessage());
                return(NameReader.getFriendName(in));
            }
            return(friendName);
        }
    }

    public static void main(String[] args)
    {
        class LittleLocalClass
        {
            public void sayHello()
            {
                System.out.println("Привет...Я маленький локальный класс, который не делает ничего полезного...А, тебе уже пора...Ну ладно, умгмх...пока...:33");
            }
        }

        LittleLocalClass littleLocalClass = new LittleLocalClass();
        littleLocalClass.sayHello();


        Scanner in = new Scanner(System.in);

        System.out.println("Эта программа симулирует спор Незнайки со своим другом.");

        String friendName = NameReader.getFriendName(in);

        System.out.print("Введите количество дневных дней, в течении которых будет проходить симуляция: ");
        int length = in.nextInt();
        in.close();

        Simulation simulation = new Simulation(length, friendName);
        simulation.run();
    }
}