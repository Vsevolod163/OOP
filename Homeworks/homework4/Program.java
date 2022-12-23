package Homeworks.homework4;

public class Program {

  public static void main(String[] args) {
    Chat gb = new Chat();

    User client1 = new User("Victor", gb);
    User client2 = new User("Roman", gb);
    User client4 = new User("Anna", gb);

    gb.appendClient(client1);
    gb.appendClient(client2);
    gb.appendClient(client4);

    client1.sendMsg("Hello!");

    client2.sendMsg("Hey!");

    User client3 = new User("Sasha", gb);
    gb.appendClient(client3);

    client3.sendMsg("Good day!");

    client4.sendMsg("How are you? =)");

    client4.setName("Irina");
    client4.sendMsg("I changed my name!)");
  }
}

interface Chatroom {
    void sendMessage(String msg, User user);
  
    void appendClient(User user);
  }
