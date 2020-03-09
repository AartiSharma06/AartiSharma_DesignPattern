package behavorial.iteratorpattern;

public class CollectionofNames implements Container {

	public String name[]={"Aarti Sharma", "Sonam Sharma","Rishav Kumar","Tara Singh","Dilgit Dosanjh"};   
      
	    public Iterator getIterator() {  
	        return new CollectionofNamesIterate() ;  
	    }  
	    private class CollectionofNamesIterate implements Iterator{  
	        int i;  
	        public boolean hasNext() {  
	            if (i<name.length){  
	                return true;  
	            }  
	            return false;  
	        }  

	        public Object next() {  
	            if(this.hasNext()){  
	                return name[i++];  
	            }  
	            return null;      
	        }  
	    }  
	} 

