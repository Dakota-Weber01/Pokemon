package pokemon.view;
import javax.swing.*;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
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
	public PokemonPanel(PokemonController appController)
	{
		super();
		this.appController = appController;
		
		appLayout = new SpringLayout();
		
		evolvableBox = JCheckBox();
		
		iconLabel = new JLabel("", new ImageIcon(getClass().getResource("")), JLabel.CENTER);
		
		
	}
	private void setupComboBox()
	{
		DefaultComboBoxModel pokemonModel = DefaultComboBoxModel(appController.convertPokedex());
		pokedexDropdown.setModel(pokemonModel);
	}
	private void setupTypePanels()
	{
		firstType.setSize(50, 50);
		secondType.setSize(50,50);
		thirdType.setSize(50, 50);
		fourthType.setSize(50, 50);
	}
	
	private void updateTypePanels()
	{
		String[] types = appController.getPokeDex().get(pokedexDropdown.getSelectedIndex()).getPokemonTypes();
		
		//Change this to match your 3 minimum types in your pokedex
	}
	
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
	
	private void setupListeners()
	{
		pokedexDropdown.addActionListener(new ActionListener()
				{
				public void actionPerformed(ActionEvent selection)
				{
					int selectedPokemIndex = pokedexDropdown.getSelectedIndex();
					updatePokedexInfo(selectedPokemonIndex);
					updateImage();
					updateTypePanels();
					repaint();
				}
				});
	}

}
