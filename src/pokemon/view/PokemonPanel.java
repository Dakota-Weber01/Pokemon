package pokemon.view;
import javax.swing.*;

import pokemon.controller.PokemonController;
public class PokemonPanel extends JPanel 
{
	public PokemonPanel() {
	}
	private PokemonController appController;
	private SpringLayout appLayout;
	
	private JLabel healthLabel;
	private JLabel attackLabel;
	private JLabel nameLabel;
	private JLabel numberLabel;
	private JLabel evolvableLabel;
	private JLabel modifierLabel;
	private JLabel iconLabel;
	
	private JCheckBox evolvableBox;
	private JTextField nameField;
	private JTextField numberField;
	private JTextField attackField;
	private JTextField healthField;
	private JTextField modifierField;
	
	private JTextArea descriptionArea;
	private JTextArea typeArea;
	
	private JButton saveButton;
	private JButton clearButton;
	private JComboBox pokedexDropdown;
	
	private JPanel firstType;
	private JPanel secondType;
	private JPanel thirdType;
	private JPanel fourthType;
	
	
	private void updatePokedexInfo(int index)
	{
		nameField.setText(appController.getPokeDex().get(index).getName());
		evolvableBox.setSelected(appController.getPokeDex().get(index).isCanEvolve());
		numberField.setText(appController.getPokeDex().get(index).getNumber() + "");
		attackField.setText(appController.getPokeDex().get(index).getAttackPoints() + "");
		healthField.setText(appController.getPokeDex().get(index).getHealthPoints() + "");
		modifierField.setText(appController.getPokeDex().get(index).getEnhancementModifier() + "");
	}
	
	private void setupLayout()
	{
		
	}
}
