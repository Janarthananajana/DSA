class Solution {
    public List<Integer> getRow(int rowIndex) {
      List<List<Integer>> list = new ArrayList<>();

list.add(new ArrayList<>(Arrays.asList(1)));

for (int i = 1; i <= rowIndex; i++) {
    List<Integer> li = new ArrayList<>();

    for (int j = 0; j <= i; j++) {
        if (j == 0 || j == i) {
            li.add(1);
        } else {
            int a = list.get(i - 1).get(j - 1)
                    + list.get(i - 1).get(j);
            li.add(a);
        }
    }

    list.add(li);
}

return list.get(rowIndex);
    }
}