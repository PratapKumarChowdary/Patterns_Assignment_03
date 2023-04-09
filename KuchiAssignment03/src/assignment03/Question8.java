Scanner scanner = null;
try {
    scanner = new Scanner(new File("example.txt"));
    // read from the file
} finally {
    // close the scanner, regardless of whether an exception was thrown or not
    if (scanner != null) {
        scanner.close();
    }
}
