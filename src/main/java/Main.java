import io.github.cdimascio.dotenv.Dotenv;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;

import javax.security.auth.login.LoginException;

public class Main {
  public static void main (String[] args)
    throws LoginException
  {

    Dotenv dotenv = Dotenv.load();

    final String BOT_TOKEN = dotenv.get("BOT_TOKEN");
    final String ACTIVITY_MESSAGE = dotenv.get("ACTIVITY_MESSAGE");

    JDA jda = JDABuilder.createDefault(BOT_TOKEN)
      .addEventListeners(new BotListener())
      .setActivity(Activity.playing(ACTIVITY_MESSAGE))
      .build();
  }
}
