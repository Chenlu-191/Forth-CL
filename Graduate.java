package Jiekou;

public class Graduate  {
    String name;
    String sex;
    int age;
    double fee;
    double pay;
    double ratal;

    public void setPay(double pay) {
        this.pay = pay * 12;
        System.out.println("���������Ϊ��" + this.pay);
    }

    public void getPay(double pay) {
        this.pay = pay * 12;
        System.out.println("���������Ϊ��" + this.pay);
    }

    public void setFee(double fee) {
        this.fee = fee;
        System.out.println("���ѧ��Ϊ��" + this.fee);
    }

    public void getFee(double fee) {
        this.fee = fee;
        System.out.println("���ѧ��Ϊ��" + this.fee);
    }

    public void setGraduate(String name, String sex, int age) {
        this.sex = sex;
        this.age = age;
        this.name = name;
    }

    public void setRatal() {
        this.ratal = this.pay - this.fee ;
        if (ratal < 30000) {
            this.ratal = (this.pay - this.fee) * 0.03;
            System.out.println("��˰��" + this.ratal);
        } else if (ratal > 30000 && ratal < 120000) {
            this.ratal = ((this.pay - this.fee) - 30000) * 0.1 + 30000 * 0.03;
            System.out.println("��˰��" + this.ratal);
        } else if (ratal > 120000 && ratal < 250000) {
            this.ratal = ((this.pay - this.fee) - 120000) * 0.2 + 30000 * 0.03 + 120000 * 0.1;
            System.out.println("��˰��" + this.ratal);
        } else if (ratal > 350000) {
            this.ratal = (this.pay - this.fee) *0.3;
            System.out.println("��˰��" + this.ratal);
        }
    }
        public String toString () {
            return "����" + name + '\n' + "����" + age + '\n' + "�Ա�" + sex;
        }
    }
