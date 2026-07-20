class Solution { 
    public String encode(List<String> strs) { 
        StringBuilder sb = new StringBuilder(); 
        for(String s : strs){ 
            sb.append(s.length()).append("#").append(s); 
        } 
        return sb.toString(); 
    } 

    public List<String> decode(String s) { // 1. Changed parameter name to 's'
        List<String> result = new ArrayList<>(); 
        int i = 0; 
        
        while(i < s.length()){ 
            int j = i; 
            while(s.charAt(j) != '#'){ // 2. Changed double quotes to single quotes '#'
                j++; 
            } 
            
            int length = Integer.parseInt(s.substring(i, j)); 
            i = j + 1; 
            
            String currentStr = s.substring(i, i + length); // 3. Renamed variable to avoid conflict
            result.add(currentStr); 
            
            i += length; 
        } 
        return result; // 4. Changed return statement to return the list
    } 
}