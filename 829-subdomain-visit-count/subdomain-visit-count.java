class Solution {
    public List<String> subdomainVisits(String[] cp) {
    HashMap<String, Integer> map = new HashMap<>();

        int[] arr = new int[cp.length];
        int index = 0;

        String[] in = new String[2];

        for (String s : cp) {
            in = s.split(" ");
            int num = Integer.parseInt(in[0]);
            arr[index++] = num;
        }

        for (int i = 0; i < cp.length; i++) {

            String[] temp = cp[i].split(" ");
            String[] s = temp[1].split("\\.");

            int n = arr[i];

            StringBuilder str = new StringBuilder();

            for (int j = 0; j < s.length; j++) {

                str.setLength(0);

                for (int k = j; k < s.length; k++) {

                    if (k > j) {
                        str.append(".");
                    }

                    str.append(s[k]);
                }

                if (map.containsKey(str.toString())) {
                    int value = map.get(str.toString()) + n;
                    map.put(str.toString(), value);
                } else {
                    map.put(str.toString(), n);
                }
            }
        }

        List<String> result = new ArrayList<>();

        for (String key : map.keySet()) {
            result.add(map.get(key) + " " + key);
        }

        return result;    
    }
}