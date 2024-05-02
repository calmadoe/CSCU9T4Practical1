package com.stir.cscu9t4practical1;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class TrainingRecord {
    private List<Entry> tr;
    
    public TrainingRecord() {
        tr = new ArrayList<Entry>();
    } //constructor
    
    // add a record to the list
    public void addEntry(Entry e) {
        tr.add(e);    
    } // addClass
   
    // look up the entry of a given day and month
    public String lookupEntry(int d, int m, int y) {
        ListIterator<Entry> iter = tr.listIterator();
        String result = "No entries found";
        while (iter.hasNext()) {
            Entry current = iter.next();
            if (current.getDay() == d && current.getMonth() == m && current.getYear() == y) 
                result = current.getEntry();
        }
        return result;
    } // lookupEntry
    
    // Get all entries on a given date
    public String getAllEntriesOnDate(int d, int m, int y) {
        StringBuilder entriesOnDate = new StringBuilder();
        for (Entry entry : tr) {
            if (entry.getDay() == d && entry.getMonth() == m && entry.getYear() == y) {
                entriesOnDate.append(entry.getEntry()).append("\n");
            }
        }
        if (entriesOnDate.length() == 0) {
            return "No entries found";
        } else {
            return entriesOnDate.toString();
        }
    }

    // Count the number of entries
    public int getNumberOfEntries() {
        return tr.size();
    }
    
    // Clear all entries
    public void clearAllEntries() {
        tr.clear();
    }
} // TrainingRecord
