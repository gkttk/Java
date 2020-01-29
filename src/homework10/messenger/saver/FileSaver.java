package homework10.messenger.saver;

import homework10.messenger.chat.Chat;
import homework10.messenger.chat.api.IChat;
import homework10.messenger.saver.api.ISaverChat;

import java.io.*;

public class FileSaver implements ISaverChat {

    @Override
    public  void saveChat(IChat chat) {
        try(FileOutputStream fos = new FileOutputStream("D:\\GitHub\\Kirill_Sviridov(Java)\\src\\homework10\\messenger\\saver\\forSaver\\Chat№" + chat.getChatID() + "(FileSaver).bin");
            ObjectOutputStream ous = new ObjectOutputStream(fos)) {
         ous.writeObject(chat);
        }
        catch(FileNotFoundException e){
            System.out.println("Файл не найден");
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }

    public  void Loader(IChat chat){
      try(FileInputStream fis = new FileInputStream("D:\\GitHub\\Kirill_Sviridov(Java)\\src\\homework10\\messenger\\saver\\forSaver\\Chat№" + chat.getChatID());
      ObjectInputStream ois = new ObjectInputStream(fis))  {
          ConsoleSaver cSaver = new ConsoleSaver();
          cSaver.saveChat((Chat)ois.readObject());
      }
      catch(FileNotFoundException e){
          System.out.println("Файл не найден");
      }
      catch (IOException e){
          e.printStackTrace();
      }
      catch(ClassNotFoundException e){
          e.printStackTrace();
      }
    }
}
