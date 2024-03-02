class Solution {
    public int romanToInt(String str) {
           LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        int sum = 0;
        res(map);
        for (int i = 0; i < str.length(); i++) {
            if (i + 1 < str.length() && map.get(str.charAt(i)) < map.get(str.charAt(i + 1))) {
                sum -= map.get(str.charAt(i));
            } else {
                sum += map.get(str.charAt(i));
            }
        }

        return sum;
    }

    private void res(LinkedHashMap<Character, Integer> map) {
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
    }
        
    }