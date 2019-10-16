package models;

import org.junit.Test;

import static org.junit.Assert.*;

public class SquadTest {
    @Test
    public void NewSquadObjectGetsInstanciatedCorrectly() {
        Squad squad = setupSquad();
        assertEquals(true, squad instanceof Squad);
    }

    @Test
    public void TaskInstantiatesWithName_true() throws Exception {
        Squad squad = setupSquad();
        assertEquals("Savages", squad.getName());
    }



    public Squad setupSquad(){
        return new Squad("Savages");
    }


}