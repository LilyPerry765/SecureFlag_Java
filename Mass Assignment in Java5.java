//cwe915
class AssetUploadParameters {
    String root = Constants.ASSETS_ROOT; // Some /path/to/assets
    String name;
    String data;
}

public void saveAsset(AssetUploadParameters params) {
    File assetPath = new File(params.root, params.name);

    PrintWriter writer = new PrintWriter(assetPath, "UTF-8");
    writer.print(params.data);
    writer.close();
}


Gson gson = new Gson();
AssetUploadParameters params = gson.fromJson(userControlledJson, AssetUploadParameters.class);