/*
 String�� �迭 seoul�� element�� Kim�� ��ġ x�� ã��, �輭���� x�� �ִٴ� String�� ��ȯ�ϴ� �Լ�, solution�� �ϼ��ϼ���. seoul�� Kim�� ���� �� ���� ��Ÿ���� �߸��� ���� �ԷµǴ� ���� �����ϴ�.

���� ����
seoul�� ���� 1 �̻�, 1000 ������ �迭�Դϴ�.
seoul�� ���Ҵ� ���� 1 �̻�, 20 ������ ���ڿ��Դϴ�.
Kim�� �ݵ�� seoul �ȿ� ���ԵǾ� �ֽ��ϴ�.
 */
package codingtest;

public class FindKim {
    public String findKim(String[] seoul){
        //x�� �輭���� ��ġ�� �����ϼ���.
        int x = 0;
    for(int i = 0; i < seoul.length; i++){
        if(seoul[i].equals("Kim")){
        x = i;
      }
    }

        return "�輭���� "+ x + "�� �ִ�";
    }

    // ������ ���� �׽�Ʈ�ڵ��Դϴ�.
    public static void main(String[] args) {
        FindKim kim = new FindKim();
        String[] names = {"Queen", "Tod","Kim"};
        System.out.println(kim.findKim(names));
    }
}