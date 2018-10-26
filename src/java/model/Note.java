/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;
import java.util.Date;
/**
 *
 * @author 747787
 */

public class Note {
    private int noteID;
    private Date dateCreated;
    private String contents;

    public Note(int noteID, Date dateCreated, String contents) {
        this.noteID = noteID;
        this.dateCreated = dateCreated;
        this.contents = contents;
    }
    
    public int getNoteID() {
        return noteID;
    }
    public Note(int noteID, String contents) {
        this.noteID = noteID;
        this.contents = contents;
    }
    public void setNoteID(int noteID) {
        this.noteID = noteID;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    
}
