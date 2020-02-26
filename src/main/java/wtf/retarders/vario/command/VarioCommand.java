package wtf.retarders.vario.command;

import wtf.retarders.vario.adapter.VarioAdapter;
import wtf.retarders.vario.adapter.VarioAdapterData;
import org.bukkit.command.CommandSender;
import org.bukkit.command.defaults.BukkitCommand;

public class VarioCommand extends BukkitCommand {

    public VarioCommand(VarioAdapter adapter, VarioAdapterData data) {
        super(null);
    }

    @Override
    public boolean execute(CommandSender commandSender, String s, String[] strings) {
        return false;
    }
}
