package sem451;

import java.time.LocalDate;
import java.util.*;

public class ReserveBlockList {
    private Map<String, ReserveBlock> reserveBlocks;

    public ReserveBlockList() {
        reserveBlocks = new HashMap<>();
    }

    public boolean addReserveBlock(ReserveBlock block) {
        if (block == null) {
            return false;
        }
        String key = createCompositeKey(block);
        if (reserveBlocks.containsKey(key)) {
            return false;
        }
        reserveBlocks.put(key, block);
        return true;
    }

    public boolean removeReserveBlock(ReserveBlock block) {
        if (block == null) {
            return false;
        }
        String key = createCompositeKey(block);
        if (!reserveBlocks.containsKey(key)) {
            return false;
        }
        reserveBlocks.remove(key);
        return true;
    }

    public ReserveBlock getReserveBlock(LocalDate date, int clock, Room room) {
        String key = createCompositeKey(date, clock, room);
        return reserveBlocks.get(key);
    }

    public void printAllReserveBlocks() {
        for (ReserveBlock block : reserveBlocks.values()) {
            System.out.println(block);
        }
    }

    public int countReserveBlocks() {
        return reserveBlocks.size();
    }

    public void clearAllReserveBlocks() {
        reserveBlocks.clear();
    }

    private String createCompositeKey(ReserveBlock block) {
        return createCompositeKey(block.getDate(), block.getClock(), block.getRoom());
    }

    private String createCompositeKey(LocalDate date, int clock, Room room) {
        return date.toString() + "_" + clock + "_" + room.getName();
    }
}
