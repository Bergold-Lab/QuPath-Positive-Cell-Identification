selectAnnotations();
removal = getCellObjects()
removeObjects(removal, true)
runPlugin('qupath.imagej.detect.cells.WatershedCellDetection', '{"detectionImage": "DAPI",  "requestedPixelSizeMicrons": 0.5,  "backgroundRadiusMicrons": 8.0,  "medianRadiusMicrons": 0.0,  "sigmaMicrons": 1.5,  "minAreaMicrons": 10.0,  "maxAreaMicrons": 400.0,  "threshold": 600.0,  "watershedPostProcess": true,  "cellExpansionMicrons": 3.0,  "includeNuclei": true,  "smoothBoundaries": true,  "makeMeasurements": true}');
runObjectClassifier("autoflor", "DsRed", "EGFP Lenient");
removal = getCellObjects().findAll{it.getPathClass().toString().contains("Autofluorescence")}
removeObjects(removal, true)