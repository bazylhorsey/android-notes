package com.bazyl.notes;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {Note.class}, version = 2)
public abstract class NotesDatabase extends RoomDatabase {
    public abstract NoteDao noteDao();
}