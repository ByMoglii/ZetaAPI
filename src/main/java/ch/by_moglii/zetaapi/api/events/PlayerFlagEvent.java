package ch.by_moglii.zetaapi.api.events;

import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class PlayerFlagEvent extends Event {

    private static final HandlerList handlers = new HandlerList();

    private final Player player;
    private final String check;
    private final String type;
    private final int violations;

    public PlayerFlagEvent(Player player, String check, String type, int violations) {
        this.player = player;
        this.check = check;
        this.type = type;
        this.violations = violations;
    }

    public Player getPlayer() {
        return player;
    }

    public String getCheck() {
        return check;
    }

    public String getType() {
        return type.replace("Type ", "");
    }

    public int getViolations() {
        return violations;
    }

    @Override
    public HandlerList getHandlers() {
        return handlers;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }

}