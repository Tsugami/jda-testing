import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.events.ReadyEvent;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;


public class BotListener extends ListenerAdapter {
  @Override
  public void onReady(ReadyEvent event) {
    System.out.println("API is ready!");
  }

  @Override
  public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
    Message msg = event.getMessage();
    if (msg.getContentRaw().equals("!ping")) {
        event.getChannel().sendMessage("Pong!").submit();
    }
  }
}
