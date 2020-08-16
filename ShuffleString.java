class Solution {
    public String restoreString(String s, int[] indices) {
    
        // creating map to store indices and given string characters in a key: value pair  
         Map<Integer,Character> map = new HashMap<Integer,Character>();
        
        //String builder to build a end result in string 
         StringBuilder sb = new StringBuilder();
        
        //Adding indices and values in map
          for(int i = 0; i < indices.length; i++){
              map.put(indices[i], s.charAt(i)); 
          }
        
        //Insertng in treemap for sorting
          TreeMap<Integer, Character> sorted = new TreeMap<Integer, Character>();
          sorted.putAll(map);
        
        //appending values into the string
          for (Map.Entry<Integer, Character> entry : sorted.entrySet())  
              sb.append(entry.getValue());
            
          return sb.toString();
      }
        
    }
