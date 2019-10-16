package models;

import org.junit.Test;

import java.time.LocalDateTime;

import static org.junit.Assert.*;

public class TaskTest {
    @Test
    public void NewHeroObjectGetsCorrectlyCreated_true() throws Exception {
        Hero hero = setupNewHero();
        assertEquals(true, hero instanceof Hero);
    }

    @Test
    public void TaskInstantiatesWithName_true() throws Exception {
        Hero hero = setupNewHero();
        assertEquals("SubZero", hero.getName());
    }


    @Test
    public void getCreatedAtInstantiatesWithCurrentTimeToday() throws Exception {
        Hero hero = setupNewHero();
        assertEquals(LocalDateTime.now().getDayOfWeek(), task.getCreatedAt().getDayOfWeek());
    }

    //helper methods
    public Hero setupNewHero(){
        return new Hero("SubZero", 1);
    }
}