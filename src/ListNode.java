//import java.util.*;
//
//public class ListNode {
//    int val;
//    ListNode next;
//
//    ListNode() {
//    }
//
//    ListNode(int val) {
//        this.val = val;
//    }
//
//    ListNode(int val, ListNode next) {
//        this.val = val;
//        this.next = next;
//    }
//}
//
//class Solution {
//    public int trap(int[] height) {
//        int max = getMax(height); //层数
//        int temp = 0; //墙的高度
//        int sum = 0;
//        for (int i = 1; i <= max; i++) {
//            boolean isStart = false; //是否开始接水
//            for (int j = 0; j < height.length; j++) {
//                if (height[j] < i && isStart) {
//                    temp++;
//                }
//                if (height[j] >= i) {
//                    sum = sum + temp;
//                    isStart = true;
//                    temp = 0;
//                }
//            }
//        }
//        return sum;
//    }
//
//    public int getMax(int[] height) {
//        int max = 0;
//        for (int i = 0; i < height.length; i++) {
//            if (height[i] > max) {
//                max = height[i];
//            }
//        }
//        return max;
//    }
//}
//
//class MyStack {
//    Queue<Integer> queue1;
//    Queue<Integer> queue2;
//
//    public MyStack() {
//        queue1 = new LinkedList<>();
//        queue2 = new LinkedList<>();
//    }
//
//    public void push(int x) {
//        queue2.offer(x);
//        while (!queue1.isEmpty()) {
//            queue2.offer(queue1.poll());
//        }
//        Queue<Integer> temp = queue2;
//        queue2 = queue1;
//        queue1 = temp;
//    }
//
//    public int pop() {
//        return queue1.poll();
//    }
//
//    public int top() {
//        if (empty()) {
//            return 0;
//        }
//        return queue1.peek();
//    }
//
//    public boolean empty() {
//        return queue1.isEmpty();
//    }
//}
//
//class Solution1 {
//    public int lengthOfLongestSubstring(String s) {
//        if (s.length() == 0) {
//            return 0;
//        }
//        HashMap<Character, Integer> map = new HashMap<>();
//        int max = 0;
//        int left = 0;
//        for (int i = 0; i < s.length(); i++) {
//
//            if (map.containsKey(s.charAt(i))) {
//                left = Math.max(left, map.get(s.charAt(i)) + 1);
//            }
//            map.put(s.charAt(i), i);
//            max = Math.max(max, i - left + 1);
//        }
//        return max;
//    }
//}
//
//class Solution2 {
//    public int[] searchRange(int[] nums, int target) {
//        List list = new ArrayList();
//        int temp = 0;
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] == target) {
//                list.add(i);
//                temp = i;
//            }
//
//        }
//        int[] arr = new int[list.size()];
//
//        if (list.size() > 0) {
//            for (int i = 0; i < list.size(); i++) {
//                Object o = list.get(i);
//                arr[i] = (int) o;
//
//                if (list.size() == 1) {
//                    return new int[]{temp, temp};
//                }
//            }
//            if (arr.length > 2) {
//                return new int[]{arr[0], arr[arr.length - 1]};
//            }
//        }
//
//        if (list.size() == 0) {
//            return new int[]{-1, -1};
//        }
//        return arr;
//    }
//}
//
//
//class Solution3 {
//    public ListNode swapPairs(ListNode head) {
//        ListNode dummyHead = new ListNode();
//        dummyHead.next = head;
//        ListNode dummy = dummyHead;
//        while (dummy.next != null && dummy.next.next != null) {
//            ListNode node1 = dummy.next;
//            ListNode node2 = dummy.next.next;
//            dummy.next = node2;
//            node1.next = node2.next;
//            node2.next = node1;
//            dummy = node1;
//        }
//        return dummyHead.next;
//    }
//}
//
//class Solution4 {
//    public ListNode removeNthFromEnd(ListNode head, int n) {
//        List list = new ArrayList();
//        ListNode header = new ListNode(0);
//        ListNode current = header;
//        while (head.next != null) {
//            list.add(head.val);
//            head = head.next;
//        }
//        for (int i = 0; i < list.size(); i++) {
//            if (i == list.size() - n) {
//                list.remove(list.get(i));
//            }
//        }
//        for (int i = 0; i < list.size(); i++) {
//            ListNode node = new ListNode();
//            current.next = node;
//            node.val = (int)list.get(i);
//            current = node;
//        }
//           return header.next;
//}
//
//    }
//    void test(){
//try {
//    Integer [] a=  {1,2,3};
//    List<Integer> list = Arrays.asList(a);
//    System.out.println(0);
//}
//    }
//}
