package goto2011aar.example1.fixtures;

import java.util.List;

public abstract class DoTableWithId {

	private List<String> currentTableEntry;
	
	public void doTable(List<List<String>> table) {
		int tableEntryStartPos = 1;
		for (int pos =tableEntryStartPos;pos<table.size(); pos++){
			currentTableEntry = table.get(pos);
			insertEntry(toId(0), currentTableEntry);
		}
	}
	public int toId(int tableEntryPos){
		return Integer.parseInt(currentTableEntry.get(tableEntryPos));
	}
	
	abstract void insertEntry(int id,List<String> tableEntry);
}
