/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataFile;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public final class Section implements IMethods,Serializable {

    protected int sectionID = 0;
    private final String FilePath = "Section.bin";
    private ArrayList<Section> sections = new ArrayList<Section>();

    public Section getSection(int ID) {
        LoadFromFile();
        for (Section a : sections) {
            if (a.sectionID == ID) {
                return a;
            }
        }
        return null;
    }

    public int getSectionID() {
        return this.sectionID;
    }

    public void setSectionID(int sectionID) {
        this.sectionID = sectionID;
    }

    @Override
    public boolean Add() {
        LoadFromFile();
        sections.add(this);
        return commitToFile();
    }

    @Override
    public boolean Remove(int ID) {
        if (SearchFor(ID)) {
            int index = getIndexof(ID);
            sections.remove(index);
            return commitToFile();
        }
        return false;
    }

    @Override
    public boolean Edit(int ID) {
        int index = getIndexof(ID);
        sections.set(index, this);
        return commitToFile();
    }

    @Override
    public int getIndexof(int ID) {
        for (int i = 0; i < sections.size(); i++) {
            if (sections.get(i).sectionID == ID) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public boolean SearchFor(int ID) {
        LoadFromFile();
        for (Section a : sections) {
            if (a.sectionID == ID) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void LoadFromFile() {
        sections = (ArrayList<Section>)  FManager.readBinary(FilePath);
    }

    @Override
    public boolean commitToFile() {
        return FManager.writeBinary(FilePath, sections);
    }

    @Override
    public boolean Dublicate(int ID) {
        LoadFromFile();
        for (Section a : sections) {
            if (a.sectionID == ID) {
                return true;
            }
        }
        return false;
    }

    public String[] ListAllSectionID() {
        LoadFromFile();
        String[] IDs = new String[sections.size()];
        for (int i = 0; i < sections.size(); i++) {
            IDs[i] = String.valueOf(sections.get(i).getSectionID());
        }
        return IDs;
    }

    public String[] ListAllIDOfSections() // Report
    {
        LoadFromFile();
        String[] SS = new String[this.sections.size()];
        for (int i = 0; i < SS.length; i++) {
            SS[i] = String.valueOf(this.sections.get(i).sectionID);
        }
        return SS;
    }
    public ArrayList<Section>ListAllSection()
    {
        LoadFromFile();
        return sections;
    }

    @Override
    public String getFile() {
        return this.sectionID + "`";
    }

}
