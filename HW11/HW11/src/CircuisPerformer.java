/*Створіть власне Checked (перевірюване) виключення InvalidExperienceException,
    яке кидається, якщо досвід артиста менший за 0 або більший за 50 років
    Додайте логіку до конструктора класу CircusPerformer,
    яка перевіряє досвід артиста і кидає InvalidExperienceException, якщо досвід менший за 0
    або більший за 50 років, обробіть виключення блоком try-catch
    безпосередньо в місці, де воно викидається
    (не перекидуйте його вище з допомогою throws)
    */


public class CircuisPerformer {

    private String name;
    private String act;
    private int experience;

    public CircuisPerformer(String name, String act, int experience) {
        if (experience < 0 || experience > 50) {
            try {
                throw new InvalidExperienceException("Sorry you either are underqualified or overquialified"); // my custom exception
            } catch (InvalidExperienceException iex) {
                System.out.println("Sorry you either are underqualified or overquialified");
            }

        } else {
            this.experience = experience;
        }
        this.name = name;
        this.act = act;
    }

    public String getName() {
        return name;
    }

    public int getExperience() {
        return experience;
    }

    public String getAct() {
        return act;
    }


    public String getAllInfo() {
        return "Name: " + getName() + ", Act: " + getAct() + ", Experience: " + getExperience();
    }

    }


