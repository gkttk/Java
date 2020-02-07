package homework10.messenger.saver;

import homework10.messenger.chat.api.IChat;
import homework10.messenger.message.Message;
import homework10.messenger.saver.api.ISaverChat;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class SaverMessagesWithToString implements ISaverChat {

    @Override
    public void saveChat(IChat chat) {
        try (PrintWriter pw = new PrintWriter(new FileOutputStream("D:\\GitHub\\Kirill_Sviridov(Java)\\src\\homework10\\messenger\\saver\\forSaver" +
                "\\chat№" + chat.getChatID() + "(SaverMessagesWithToString).txt"))) {
            for (Message message : chat.getChatMessages()) {
                pw.println(message.toString());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }
}
