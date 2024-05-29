package generator.views;

import java.io.File;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import abstracta.AbstractaFactory;
import abstracta.AbstractaPackage;
import abstracta.ClassifierWc;
import abstracta.ModelFactoryAbstractaWc;
import abstracta.PackageWc;
import abstracta.TypeWc;
import mconcreta.Aggregation;
import mconcreta.Association;
import mconcreta.AttributeWc;
import mconcreta.ClassDiagramWc;
import mconcreta.ClassWc;
import mconcreta.Composition;
import mconcreta.DataTypeFactoryWc;
import mconcreta.Generalization;
import mconcreta.MconcretaFactory;
import mconcreta.MconcretaPackage;
import mconcreta.MethodWc;
import mconcreta.ModelFactoryConcretaWc;
import mconcreta.ProjectWc;
import mconcreta.RelationBinary;
import mconcreta.RelationWc;







public class ModelFactoryModel {
	
	private ArrayList<String> pathsAux = new ArrayList<>();

	// -------------------------------------------------------------------------- Singleton --------------------------------------------------------------------------

	// Clase estatica oculta. Tan solo se instanciara el singleton una vez
	private static class SingletonHolder {
		// El constructor de Singleton puede ser llamado desde aqui al ser protected
		private final static ModelFactoryModel eINSTANCE = new ModelFactoryModel();
	}

	// Metodo para obtener la instancia de nuestra clase
	public static ModelFactoryModel getInstance() {
		return SingletonHolder.eINSTANCE;
	}

	//Creacion de las factories 
	ModelFactoryConcretaWc modelFactoryConcreta = MconcretaFactory.eINSTANCE.createModelFactoryConcretaWc();
	ModelFactoryAbstractaWc modelFactoryAbstracta = AbstractaFactory.eINSTANCE.createModelFactoryAbstractaWc();

	public ModelFactoryModel() {
		modelFactoryConcreta = loadConcretaModel();
		modelFactoryAbstracta = loadAbstractaModel();
	}




	// -----------------------------------------------------------------Load and Save ModelFactorys ---------------------------------------------------------------

	/**
	 * Este metodo permite cargar el modelfactoryspecific del diagrama de clases
	 * @return El modelFactorySpecific cargada
	 */
	public ModelFactoryConcretaWc loadConcretaModel() {
		ModelFactoryConcretaWc modelFactoryConcreta = null;
		MconcretaPackage whoownmePackage = MconcretaPackage.eINSTANCE;
		org.eclipse.emf.ecore.resource.ResourceSet resourceSet = new org.eclipse.emf.ecore.resource.impl.ResourceSetImpl();
		org.eclipse.emf.common.util.URI uri = org.eclipse.emf.common.util.URI
				.createURI("platform:/resource/empresa/src/modelo/model.mconcreta");
		org.eclipse.emf.ecore.resource.Resource resource = resourceSet.createResource(uri);
		try {
			resource.load(null);
			modelFactoryConcreta = (ModelFactoryConcretaWc) resource.getContents().get(0);
			System.out.println("loaded: " + modelFactoryConcreta);
		} catch (java.io.IOException e) {
			System.out.println("failed to read " + uri);
			System.out.println(e);
		}
		return modelFactoryConcreta;
	}

	/**
	 * Este metodo permite cargar el modelFactoryAbstract del diagrama de clases
	 * @return
	 */
	public ModelFactoryAbstractaWc loadAbstractaModel() {
		ModelFactoryAbstractaWc modelFactoryAbstracta = null;
		AbstractaPackage whoownmePackage = AbstractaPackage.eINSTANCE;
		org.eclipse.emf.ecore.resource.ResourceSet resourceSet = new org.eclipse.emf.ecore.resource.impl.ResourceSetImpl();
		org.eclipse.emf.common.util.URI uri = org.eclipse.emf.common.util.URI
				.createURI("platform:/resource/empresa/src/modelo/model.abstracta");
		org.eclipse.emf.ecore.resource.Resource resource = resourceSet.createResource(uri);
		try {
			resource.load(null);
			modelFactoryAbstracta = (ModelFactoryAbstractaWc) resource.getContents().get(0);
			System.out.println("loaded: " + modelFactoryAbstracta);
		} catch (java.io.IOException e) {
			System.out.println("failed to read " + uri);
			System.out.println(e);
		}
		return modelFactoryAbstracta;
	}


	/**
	 * Este metodo permite guardar el ModelFactorySpecific del diagrama de clases
	 */
	public void saveConcreta() {

		// EXISTEN 2 FORMAS DE GUARDAR EL RECURSO
		org.eclipse.emf.common.util.URI uri = org.eclipse.emf.common.util.URI
				.createURI("platform:/resource/empresa/src/modelo/model.mconcreta");
		org.eclipse.emf.ecore.resource.ResourceSet resourceSet = new org.eclipse.emf.ecore.resource.impl.ResourceSetImpl();

		org.eclipse.emf.ecore.resource.Resource resource = resourceSet.createResource(uri);
		resource.getContents().add(modelFactoryConcreta);
		try {
			resource.save(java.util.Collections.EMPTY_MAP);
		} catch (java.io.IOException e) {
			// TO-DO Auto-generated catch block
			e.printStackTrace();
		}
	}



	/**
	 * Este metodo permite guardar el ModelFactoryAbstract del diagrama de clases
	 */
	public void saveAbstracta() {

		// EXISTEN 2 FORMAS DE GUARDAR EL RECURSO
		org.eclipse.emf.common.util.URI uri = org.eclipse.emf.common.util.URI
				.createURI("platform:/resource/empresa/src/modelo/model.abstracta");
		org.eclipse.emf.ecore.resource.ResourceSet resourceSet = new org.eclipse.emf.ecore.resource.impl.ResourceSetImpl();

		org.eclipse.emf.ecore.resource.Resource resource = resourceSet.createResource(uri);
		
	
		modelFactoryAbstracta.getProjects().get(0).getPackages().get(0).getChildrenPackagesWc().remove(0);
			

		resource.getContents().add(modelFactoryAbstracta);
		try {
			resource.save(java.util.Collections.EMPTY_MAP);
		} catch (java.io.IOException e) {
			// TO-DO Auto-generated catch block
			e.printStackTrace();
		}
	}



	// ----------------------------------------- Tranformacion M2M de parte especifica a parte a abstracta -------------------------------------------

	/**
	 * Este metodo realiza la transformacion del modelo especifico a el modelo
	 * abstracto
	 */
	public void transformationM2M() {

		modelFactoryConcreta = loadConcretaModel();// el modelo oigen
		modelFactoryAbstracta = loadAbstractaModel();// el modelo destino
		modelFactoryAbstracta.getProjects().clear();
		
		//loadPrimitivesTypesWc(modelFactoryConcreta, modelFactoryAbstracta);
		
		//Bloque que permite cargar los tipos de datos de mi lenguaje
		if (modelFactoryConcreta.getTypeFactoryWc().getType().size() != 0) {
			abstracta.DataTypeFactoryWc dataTypeFaAbs = AbstractaFactory.eINSTANCE.createDataTypeFactoryWc();
			for (mconcreta.TypeWc typeAux : modelFactoryConcreta.getTypeFactoryWc().getType()) {
				abstracta.TypeWc auxAbsType = AbstractaFactory.eINSTANCE.createTypeWc();
				auxAbsType.setName(typeAux.getName());
				dataTypeFaAbs.getListTypesWc().add(auxAbsType);
				
			}
			modelFactoryAbstracta.setTypeFactoryWc(dataTypeFaAbs);
		}

		

		for (ProjectWc projectWcConcreta : modelFactoryConcreta.getProjects()) {

			// por un proyecto de la concreta se crea uno en la abstracta
			abstracta.ProjectWc proyectoWcAbstracta = AbstractaFactory.eINSTANCE.createProjectWc();
			proyectoWcAbstracta.setName(projectWcConcreta.getName());
			proyectoWcAbstracta.setPath(projectWcConcreta.getPath());
			modelFactoryAbstracta.getProjects().add(proyectoWcAbstracta);
			
			
//			cada proyecto tiene un paquete raíz, cuyo path es ""
			abstracta.PackageWc packageRaizWc = AbstractaFactory.eINSTANCE.createPackageWc();
			packageRaizWc.setName(projectWcConcreta.getName());
			packageRaizWc.setPath("");
			proyectoWcAbstracta.getPackages().add(packageRaizWc); //se agrega el primer paquete, el raíz
			
			for (ClassDiagramWc diagrama : projectWcConcreta.getClassDiagrams()) {			
				for (mconcreta.PackageWc packageConcreta : diagrama.getPackages()) {
					
					System.out.println("Name package: " + packageConcreta.getName()+ " - Path: " + packageConcreta.getPath() + ".       Y " + packageRaizWc.getChildrenPackagesWc() );
					crearPaquete( packageConcreta, packageRaizWc );
				}
				for (ClassWc classWcConcreta : diagrama.getListClass()) {
					crearClass(packageRaizWc, classWcConcreta);
				}
				
//				for (RelationWc relationWc : diagrama.getRelationship()) {
//					crearRelacion(relationWc, packageRaizWc);
//				}
			}
			
			
		}
		saveAbstracta();
	}

	private void loadPrimitivesTypesWc(ModelFactoryConcretaWc modelFactoryConcreta2,
			ModelFactoryAbstractaWc modelFactoryAbstracta2) {

		//-------------------------------------------  TYPES CONCRETA ------------------------------------------		
		mconcreta.DataTypeFactoryWc typesConcretaWc = MconcretaFactory.eINSTANCE.createDataTypeFactoryWc();
		
		mconcreta.TypeWc type1 = MconcretaFactory.eINSTANCE.createTypeWc();
		mconcreta.TypeWc type2 = MconcretaFactory.eINSTANCE.createTypeWc();		
		mconcreta.TypeWc type3 = MconcretaFactory.eINSTANCE.createTypeWc();		
		type1.setName("String");
		type2.setName("int");		
		type3.setName("boolean");		
		
		typesConcretaWc.getType().add(type1);
		typesConcretaWc.getType().add(type2);
		typesConcretaWc.getType().add(type3);
		modelFactoryConcreta2.setTypeFactoryWc( typesConcretaWc );
		
		//-------------------------------------------  TYPES ABSTRACTA ------------------------------------------
		abstracta.DataTypeFactoryWc dataTypeFaAbs = AbstractaFactory.eINSTANCE.createDataTypeFactoryWc();
		for (mconcreta.TypeWc typeAux : modelFactoryConcreta2.getTypeFactoryWc().getType()) {
			abstracta.TypeWc auxAbsType = AbstractaFactory.eINSTANCE.createTypeWc();
			auxAbsType.setName(typeAux.getName());
			dataTypeFaAbs.getListTypesWc().add(auxAbsType);
			
		}
		modelFactoryAbstracta2.setTypeFactoryWc(dataTypeFaAbs);
	}




	private void crearPaquete( mconcreta.PackageWc packageConcreta, abstracta.PackageWc packageRaizWc ) {

		abstracta.PackageWc newPaqueteAbstracta = null;
		newPaqueteAbstracta = AbstractaFactory.eINSTANCE.createPackageWc();
		newPaqueteAbstracta.setName(packageConcreta.getName());
		newPaqueteAbstracta.setPath(packageConcreta.getPath()== null?"":packageConcreta.getPath());

		abstracta.PackageWc packageWcPadre = obtenerPackagePadre( packageConcreta.getPath(), packageRaizWc );//src/main
		packageWcPadre.getChildrenPackagesWc().add( newPaqueteAbstracta );
	}
	
	private abstracta.PackageWc obtenerPackagePadre(String path, abstracta.PackageWc packageRaizWc) {
		abstracta.PackageWc padreAux = packageRaizWc;
		if (path != null) {
			pathsAux.add(path); //Se agregarán por defecto a este paquete las clases que no tengan path definido
			
			System.out.println("********************* EN obtenerPackagePadre (PATH != NULL) --> "+ path + "****************** " + " / PackRaiz: " + packageRaizWc.getPath());
			String[] pathArray = path.split("/");//src,main		
			for (int j = 0; j < pathArray.length; j++) {
				padreAux = obtenerPaquete( pathArray[j], padreAux);
			}
			
//			if (pathArray.length == 0) {
//				padreAux = obtenerPaquete( path, padreAux);	
//			}
		} else {	
			padreAux = obtenerPaquete( path, padreAux);	
		}		
		return padreAux;
	}
	private abstracta.PackageWc obtenerPaquete(String nameP, abstracta.PackageWc packageParentWc) {
		for (abstracta.PackageWc pack : packageParentWc.getChildrenPackagesWc()) {
			if(pack.getName().equalsIgnoreCase(nameP)) {
				System.out.println("********************** ENTRA EN pack.name == nameP --> "+ nameP + "****************** "+" PackRaiz: " + packageParentWc.getPath());
				return pack;
			}
		}
		abstracta.PackageWc packageAux = AbstractaFactory.eINSTANCE.createPackageWc();
		packageAux.setName(nameP==null?"": nameP);
		packageAux.setPath(packageParentWc.getPath()+"/"+packageParentWc.getName());
		packageParentWc.getChildrenPackagesWc().add(packageAux);
		return packageAux;
	}

	private void crearRelacion(RelationWc relationWcConcreta, abstracta.PackageWc packageRaizWc) {

		ClassWc sourceConcreta = relationWcConcreta.getSource();
		ClassWc targetConcret = relationWcConcreta.getTarget();
		
		abstracta.ClassWc classWcAbstractaSource = obtenerClase(sourceConcreta, packageRaizWc);
		abstracta.ClassWc classWcAbstractaTarget = obtenerClase(targetConcret, packageRaizWc);
		
		
		abstracta.RelationWc relationWcAbstractaSource = null;
        if (relationWcConcreta instanceof Association) {
        	relationWcAbstractaSource = AbstractaFactory.eINSTANCE.createAssociation();
        	//relationWcAbstractaTarget = AbstractaFactory.eINSTANCE.createAssociation();
        } else if (relationWcConcreta instanceof Composition) {
        	relationWcAbstractaSource = AbstractaFactory.eINSTANCE.createComposition();
        	//relationWcAbstractaTarget = AbstractaFactory.eINSTANCE.createComposition();
        } else if (relationWcConcreta instanceof Aggregation) {
        	relationWcAbstractaSource = AbstractaFactory.eINSTANCE.createAggregation();
        	//relationWcAbstractaTarget = AbstractaFactory.eINSTANCE.createAggregation();
        } else if (relationWcConcreta instanceof Generalization) {
        	relationWcAbstractaSource = AbstractaFactory.eINSTANCE.createGeneralization();
        	//relationWcAbstractaTarget = AbstractaFactory.eINSTANCE.createGeneralization();
        }else {
        	relationWcAbstractaSource = AbstractaFactory.eINSTANCE.createRelationBinary();
        	//relationWcAbstractaTarget = AbstractaFactory.eINSTANCE.createRelationBinary();
        }
   
        //classWcAbstractaSource.setSource(classWcAbstractaSource);
        relationWcAbstractaSource.setSource(classWcAbstractaSource);
        relationWcAbstractaSource.setTarget(classWcAbstractaTarget);
        relationWcAbstractaSource.setRoleA(relationWcConcreta.getRoleA());
        relationWcAbstractaSource.setRoleB(relationWcConcreta.getRoleB());
        relationWcAbstractaSource.setMultA(relationWcConcreta.getMultA());
        relationWcAbstractaSource.setMultB(relationWcConcreta.getMultB());
        classWcAbstractaSource.getListRelationshipOut().add(relationWcAbstractaSource);
		
        relationWcAbstractaSource.setSource(classWcAbstractaTarget);
        relationWcAbstractaSource.setTarget(classWcAbstractaSource);
        relationWcAbstractaSource.setRoleA(relationWcConcreta.getRoleB());
        relationWcAbstractaSource.setRoleB(relationWcConcreta.getRoleA());
        relationWcAbstractaSource.setMultA(relationWcConcreta.getMultB());
        relationWcAbstractaSource.setMultB(relationWcConcreta.getMultA());
		classWcAbstractaTarget.getListRelationshipOut().add(relationWcAbstractaSource);
		packageRaizWc.getRelationship().add(relationWcAbstractaSource);
	}


	private abstracta.ClassWc obtenerClase(ClassWc claseABuscar, abstracta.PackageWc packageRaizWc) {

		abstracta.PackageWc packageRam = obtenerPackagePadre(claseABuscar.getPathPackage(), packageRaizWc);
		
		for (abstracta.ClassWc clase : packageRam.getListsClassWc()) {
			if(claseABuscar.getName().equals(clase.getName())) {
				return clase;
			}
		}
		return null;
	}




	private void crearClass(abstracta.PackageWc packageRaizRam, ClassWc classWcConcreta) {
		abstracta.ClassWc auxAbstracta = AbstractaFactory.eINSTANCE.createClassWc();
		//classWcAbsracta.setDescription(classRamConcreta.getDescription());
		auxAbstracta.setIsAbstract(classWcConcreta.isIsAbstract());
		auxAbstracta.setName(classWcConcreta.getName());
		auxAbstracta.setPathPackage(classWcConcreta.getPathPackage());
		
	
		
		//System.out.println("******************************* CREANDO CLASE ABSTRACTA - PATH CLASE: "+ auxAbstracta.getPathPackage() + "  - PATH AUX: " + pathsAux.get(0) + " ******************");
		abstracta.PackageWc paquetePadre = obtenerPackagePadre( auxAbstracta.getPathPackage() == null? pathsAux.get(0) : auxAbstracta.getPathPackage(), packageRaizRam );

		
		for (AttributeWc auxAttr : classWcConcreta.getAttributes()) {
			abstracta.AttributeWc attributeWcAbstracta = AbstractaFactory.eINSTANCE.createAttributeWc();
			attributeWcAbstracta.setName(auxAttr.getName());
			
			abstracta.ClassifierWc typeAuxAbs = null;
			if (auxAttr.getTypeClassifier() instanceof mconcreta.TypeWc) {
				typeAuxAbs = AbstractaFactory.eINSTANCE.createTypeWc();
				typeAuxAbs.setName(auxAttr.getTypeClassifier().getName());				
				attributeWcAbstracta.setTypeClassifier(typeAuxAbs);
			} else if (auxAttr.getTypeClassifier() instanceof ClassWc) {
				typeAuxAbs = AbstractaFactory.eINSTANCE.createClassWc();
				typeAuxAbs.setName(auxAttr.getTypeClassifier().getName());
				attributeWcAbstracta.setTypeClassifier(typeAuxAbs);
			} else {
				abstracta.ClassifierWc typeByDefect = AbstractaFactory.eINSTANCE.createTypeWc();
				typeByDefect.setName("String");
				attributeWcAbstracta.setTypeClassifier(typeByDefect);
			}
			
			attributeWcAbstracta.setValue( auxAttr.getValue() == null ? "" : auxAttr.getValue() );
			auxAbstracta.getFeatures().add(attributeWcAbstracta);
		}
		
		//--------------------------------- BLOQUE PARA DEFINIR MÉTODOS ----------------------------
		for (MethodWc auxMethCon : classWcConcreta.getMethods()) {
			abstracta.MethodWc methodWc = AbstractaFactory.eINSTANCE.createMethodWc();
			methodWc.setName(auxMethCon.getName());
			methodWc.setBody(auxMethCon.getBody());
			methodWc.setIsQuery( auxMethCon.isIsQuery() );
			
			//--------------------  Bloque para definir modificador de acceso ----------------------
			abstracta.AccesModifyWc auxAM = null;
			if ( auxMethCon.getAccesModify() == mconcreta.AccesModifyWc.PROTECTED ){
				auxAM = abstracta.AccesModifyWc.PROTECTED;
			} else if ( auxMethCon.getAccesModify() == mconcreta.AccesModifyWc.PUBLIC ){
				auxAM = abstracta.AccesModifyWc.PUBLIC;
			} else {
				auxAM = abstracta.AccesModifyWc.PRIVATE;
			}
			methodWc.setAccesModify(auxAM);
			
			//--------------------  Bloque para definir tipo de dato del método ----------------------
			abstracta.ClassifierWc typeAuxAbsM = null;
			if (auxMethCon.getType() instanceof mconcreta.TypeWc) {
				typeAuxAbsM = AbstractaFactory.eINSTANCE.createTypeWc();
				typeAuxAbsM.setName(auxMethCon.getType().getName());				
				methodWc.setType(typeAuxAbsM);
			} else if (auxMethCon.getType() instanceof ClassWc) {
				typeAuxAbsM = AbstractaFactory.eINSTANCE.createClassWc();
				typeAuxAbsM.setName(auxMethCon.getType().getName());
				methodWc.setType(typeAuxAbsM);
			} else {
				abstracta.ClassifierWc typeByDefect = AbstractaFactory.eINSTANCE.createTypeWc();
				typeByDefect.setName("String");
				methodWc.setType(typeByDefect);
			}
			
			
			//--------------------  Bloque para definir parámetros ----------------------
			for (mconcreta.AttributeWc prmt : auxMethCon.getParameters()) {
				abstracta.AttributeWc auxAttAbs1 = AbstractaFactory.eINSTANCE.createAttributeWc();
				
				auxAttAbs1.setName(prmt.getName());
				
				abstracta.ClassifierWc typeAuxAbs1 = null;
				if (prmt.getTypeClassifier() instanceof mconcreta.TypeWc) {
					typeAuxAbs1 = AbstractaFactory.eINSTANCE.createTypeWc();
					typeAuxAbs1.setName(prmt.getTypeClassifier().getName());				
					auxAttAbs1.setTypeClassifier(typeAuxAbs1);
				} else if (prmt.getTypeClassifier() instanceof ClassWc) {
					typeAuxAbs1 = AbstractaFactory.eINSTANCE.createClassWc();
					typeAuxAbs1.setName(prmt.getTypeClassifier().getName());
					auxAttAbs1.setTypeClassifier(typeAuxAbs1);
				} else {
					abstracta.ClassifierWc typeByDefect1 = AbstractaFactory.eINSTANCE.createTypeWc();
					typeByDefect1.setName("String");
					auxAttAbs1.setTypeClassifier(typeByDefect1);
				}
				auxAttAbs1.setValue( prmt.getValue() == null ? "" : prmt.getValue() );
				methodWc.getParameters().add(auxAttAbs1);			
			}
			
			auxAbstracta.getFeatures().add(methodWc);
		}
		
		
		paquetePadre.getListsClassWc().add(auxAbstracta);
		System.out.println(auxAbstracta);
		//packageRaizRam.getChildrenPackagesWc().add(paquetePadre);
		
	}


	// -------------------------------- Tranformacion M2T de parte abstracta a archivos de texto -----------------------------------------------

	private TypeWc obtenerTipo(String nameType) {
		
		if(nameType.equals("String")) {
			TypeWc typeWc = AbstractaFactory.eINSTANCE.createTypeWc();
			typeWc.setName("String");
			return typeWc;
		}
		return null;
	}







	/**
	 * Este metodo permite abrir un cuadro de dialogo para ingresar el nomber del proyecto
	 * @return el nombre del proyecto
	 */
	public String ingresarInput() {
		// Mostrar un cuadro de diálogo de entrada
		String nameProject = JOptionPane.showInputDialog("Ingrese el nombre del projecto:");

		// Comprobar si el usuario ingresó algo y mostrarlo
		if (nameProject != null) {
			return nameProject;
		} else {
			return "newProject";
		}
	}










	/**
	 * Este metodo permite crear una carpeta en el sistema de windows
	 * @param path
	 * @param nameFolder
	 */
	private void createFolderWindows(String path, String nameFolder) {

		// Crea un objeto File que representa la carpeta
		File newFolder = new File(path, nameFolder);

		// Verifica si la carpeta ya existe
		if (!newFolder.exists()) {
			// Intenta crear la carpeta
			boolean creado = newFolder.mkdirs();
			if (creado) {
				System.out.println("La carpeta se creó exitosamente.");
			} else {
				System.out.println("No se pudo crear la carpeta.");
			}
		} else {
			System.out.println("La carpeta ya existe.");
		}
	}

	/**
	 * Este metodo permite crear un archivo en el sistema de windows
	 * @param path
	 * @param nameFile
	 * @param content
	 */
	private void createFileWindows(String path, String nameFile, String content) {

		// Combinar la ruta y el nombre del archivo
		String absolutePath = path + "\\" + nameFile + ".py";

		try {
			// Crear un objeto FileWriter para escribir en el archivo
			FileWriter fileWriter = new FileWriter(absolutePath);

			// Crear un objeto PrintWriter para escribir en el archivo de manera más
			// conveniente
			PrintWriter printWriter = new PrintWriter(fileWriter);

			// Agregar contenido al archivo (por ejemplo, un programa Python simple)
			printWriter.println(content);
			printWriter.close();

			System.out.println("El archivo se creó exitosamente.");
		} catch (IOException e) {
			System.out.println("Error al crear el archivo: " + e.getMessage());
		}
	}



}
