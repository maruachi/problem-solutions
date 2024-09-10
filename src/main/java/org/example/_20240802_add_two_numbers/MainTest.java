package org.example._20240802_add_two_numbers;

import org.junit.jupiter.api.Test;

public class MainTest {
    @Test
    public void test() {
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3, null)));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4, null)));

        ListNode listNode = addTwoNumbers(l1, l2);

        ListNode currListNode = listNode;
        while (true) {
            System.out.println(currListNode.val);
            if (currListNode.next == null) {
                break;
            }
            currListNode = currListNode.next;
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int lvalue1 = toNumber(l1);
        int lvalue2 = toNumber(l2);

        return toListNode(lvalue1 + lvalue2);
    }

    private int toNumber(ListNode l1) {
        StringBuilder stringBuilder = new StringBuilder();
        while (true) {
            stringBuilder.insert(0, l1.val);
            if (l1.next == null) {
                break;
            }
            l1 = l1.next;
        }
        return Integer.parseInt(stringBuilder.toString());
    }

    private ListNode toListNode(int value) {
        StringBuilder stringBuilder = new StringBuilder();
        ListNode rootNode = null;
        ListNode preListNode = null;

        if (value == 0) {
            return new ListNode(0);
        }

        //첫번째 digit이 첫번째 노드에 위치
        while (true) {
            if (value == 0) {
                break;
            }

            int digit = value % 10;
            value = value / 10;

            ListNode listNode = new ListNode(digit);
            if (preListNode == null) {
                rootNode = listNode;
                preListNode = listNode;
                continue;
            }

            preListNode.next = listNode;
            preListNode = listNode;

            stringBuilder.append(digit);
        }

        return rootNode;
    }

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
