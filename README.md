# CloverDX Task — Adrien Weber

Solution for the CloverDX task.

## Contents

- `graph/simpletest.grf` — main transformation graph
- `trans/MyTransform.java` — custom Java transformation (compiled `.class` included)
- `data-in/` — input files (`customers.txt`, `orders.txt`, `items.xlsx`)
- `workspace.prm` — project parameters (relative paths via `${PROJECT}`)

Output is written to `data-out/` at runtime.

## How to import into CloverDX Designer

1. Open CloverDX Designer.
2. `File` → `Switch Workspace…` → choose any empty folder as your workspace.
3. `File` → `Import…` → `General` → `Existing Projects into Workspace` → `Next`.
4. At **Select root directory**, browse to the unzipped `Adrien-Weber` folder (or the cloned repository folder).
5. Tick **Copy projects into workspace**.
6. `Finish`.

The project `Adrien-Weber` will appear in the Project Explorer.

## How to run

1. In the Project Explorer, open `graph/simpletest.grf`.
2. Click the green **Run** button (or right-click the graph → `Run As → CloverDX graph`).
3. Check the `Console` tab for `FINISHED_OK`.
4. The output file appears under `data-out/`.

## Notes

- All paths in the graph use project parameters (`${DATAIN_DIR}`, `${DATAOUT_DIR}`, …), so no path adjustments are needed after import.
- `trans/MyTransform.class` is included so the project runs even without recompiling the Java source.
- Empty standard folders (`conn/`, `lib/`, `lookup/`, `meta/`, …) are created automatically by Designer on import if missing.

## Repository

<https://github.com/AdrienWeber/cloverDXTask>
