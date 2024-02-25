package View;

public enum UserInterfaceCommands {
    INPUT_ID("Введите ID товара"),
    INPUT_NAME("Введите имя товара"),
    INPUT_PRICE("Введите цену товара"),
    ERROR_INPUT("Вы ввели неправильное значение, попробуйте ещё раз");

    private String commandName;

    public String getCommandName() {
        return this.commandName;
    }

    private UserInterfaceCommands(String commandName) {
        this.commandName = commandName;
    }
}
