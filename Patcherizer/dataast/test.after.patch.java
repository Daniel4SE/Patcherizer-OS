public final class CursorToBulkCursorAdaptor extends BulkCursorNative   { public void close ( ) {   maybeUnregisterObserverProxy ( ) ;   mCursor . deactivate ( ) ;     }   public int requery ( IContentObserver observer , CursorWindow window ) {     } } 
package groovy . util ;   import groovy . lang . Closure ;   import groovy . lang . GroovyObject ;   import groovy . lang . GroovyObjectSupport ;   import groovy . lang . Writable ;   import org . codehaus . groovy . runtime . DefaultGroovyMethods ;     
import java . util . logging . Level ;         final class Closer implements Closeable { public void test ( ) {       } } 
public abstract class DockingStation {     public boolean linkIsDocked ( ) {   if ( isTaken ( ) ) {   return robotTaking ( ) . getDockingStation ( ) == this ;   } else {   return false ;     } } } 
public class PImage implements PConstants , Cloneable { public void test ( ) {   if ( y + h > height ) h = height - y ;   PImage newbie = new PImage ( w , h , format ) ;   int index = y * width + x ;   int index2 = 0 ;     } } 
public class Solo { public void test ( ) { {   robotiumUtils . sendKeyCode ( KeyEvent . KEYCODE_DEL ) ;   break ;     break ;   }   }     } 
public class CassandraDaemon   { public void test ( ) { { {   keyspace . viewManager . buildAllViews ( ) ;   }   }   } ;     } 
public class GitRootScanner implements BulkFileListener , ModuleRootListener , Dis     { public void dispose ( ) { {   }       } } 
public final class Crouton {     private void initializeCroutonView ( ) {   Resources resources = this . activity . getResources ( ) ;       } } 
public class TridentTopologyBuilder { public void test ( ) { { {   bd . allGrouping ( masterCoordinator ( batchGroup ) , MasterBatchCoordinator . COMMIT_STREAM_ID ) ;   }   for ( Map m : c . componentConfs ) {   scd . addConfigurations ( m ) ;   }   }   }     } 
import com . liferay . portlet . wiki . service . WikiPageLocalServiceUtil ;     public class WikiDLStoreConvertProcess implements DLStoreConvertProcess {   public void migrate ( final DLStoreConverter dlStoreConverter )   throws PortalException {     } } 
public class Notification {       public Type getType ( ) {   return isTriggered ( ) ? Type . TRIGGERED : Type . SCHEDULED ;   }       } 
public class DataInfo extends Keyed {     private DataInfo ( int nums ) {   _nums = nums ;   _catOffsets = new int [ ] { 0 } ;   _predictor_transform = TransformType . NONE ;     } } 
import org . junit . Test ;   import java . io . File ;   import java . util . Arrays ;   import java . util . List ;         
public final class RemoteConnection {       public boolean isRingbackRequested ( ) {   return false ;   }       } 
import java . util . List ;         public class LineBufferTest extends IoTestCase {   public void testProcess ( ) throws IOException {     } } 
public class WindowFrame extends Composite   { public void test ( ) {   if ( ! isVisible ( ) )   fireEvent ( new WindowStateChangeEvent ( WindowState . NORMAL ) ) ;   }       } 
public class BaseObject3D implements IObject3D , Comparable < BaseObject3D > , ITrans   { public boolean isDoubleSided ( ) {   return mDoubleSided ;   }   public void setDoubleSided ( boolean doubleSided ) {   this . mDoubleSided = doubleSided ;     } } 
public class FieldNode extends AnnotatedNode implements Opcodes , Variable {   public void setType ( ClassNode type ) {   this . type = type ;   dynamicTyped |= type == ClassHelper . DYNAMIC_TYPE ;   }     } 
public class TitlePageIndicator extends View implements PageIndicator { public void test ( ) {     if ( mCurrentPage >= boundsSize ) {   setCurrentItem ( boundsSize - 1 ) ;   }   final int countMinusOne = count - 1 ;     } } 
public class Node implements Writable {     public List children ( ) {   return this . children ( ) ;   }   public void addChild ( final Object child ) {     } } 
public class Geometry3D { public void test ( ) {   if ( type == BufferType . SHORT_BUFFER )   byteSize = SHORT_SIZE_BYTES ;   GLES20 . glBindBuffer ( target , handle ) ;   GLES20 . glBufferData ( target , buffer . limit ( ) * byteSize , buffer , usage ) ;   GLES20 . glBindBuffer ( target , 0 ) ;     } } 
public class SimpleThreesideDiffViewer extends ThreesideTextDiffViewer { public void test ( ) { {   }   myInvalidDiffChanges . clear ( ) ;   myContentPanel . repaintDividers ( ) ;   myStatusPanel . update ( ) ;   }     } 
public class GitUtil { public void test ( ) { { {   }   pathToDir = FileUtil . toSystemIndependentName ( canonicalPath ) ;   }   return VcsUtil . getVirtualFile ( pathToDir ) ;   }       } 
public class VizModel { public void test ( ) {     textModel . writeXML ( writer ) ;   writer . writeEndElement ( ) ;     writer . writeStartElement ( " cameraposition " ) ;     } } 
package git4idea . tests ;   import com . intellij . openapi . util . SystemInfo ;   import git4idea . config . GitVersion ;   import org . testng . annotations . Test ;   import java . lang . reflect . Field ;     
import java . net . URLClassLoader ;   public class ModClassLoader extends URLClassLoader {   public ModClassLoader ( ) {   super ( new URL [ 0 ] ) ;   }   public void addFile ( File modFile ) throws MalformedURLException {     } } 
public class TestHttp11InputBuffer extends TomcatBaseTest {   private Exception doRequest ( ) {   Tomcat tomcat = getTomcatInstance ( ) ;   Context root = tomcat . addContext ( " " , TEMP_DIR ) ;     } } 
public class AQUtility {     public static Context getContext ( ) { {   return context ;   }   }     } 
public class LoadingLayoutProxy implements ILoadingLayout {     public void setReleaseLabel ( CharSequence label ) {   for ( LoadingLayout layout : mLoadingLayouts ) {   layout . setRefreshingLabel ( label ) ;   }   }     } 
public class PGraphicsAndroid2D extends PGraphics {   public void rotate ( float angle ) {   canvas . rotate ( angle ) ;   }     } 
public class Tmp { public enum SQLDialect {   ;   private static final SQLDialect [ ] FAMILIES ;     } } 
public class YUICompressor {       private ScriptOrFnScope getHighestFnScope ( ScriptOrFnScope scope ) {   while ( scope . getParentScope ( ) != globalScope ) {   scope = scope . getParentScope ( ) ;   }     } } 
public class PJOGL extends PGL {   public PJOGL ( PGraphicsOpenGL pg ) {   super ( pg ) ;   if ( glu == null ) glu = new GLU ( ) ;   }     } 
import javax . swing . JComponent ;   import processing . app . Preferences ;   import processing . app . syntax . im . CompositionTextPainter ;   import processing . app . ui . Editor ;       
public class Tmp { public interface WindowManager extends ViewManager {         } public static final int PRIVATE_FLAG_SUSTAINED_PERFORMANCE_MODE = 0x00020000 ;         } 
public class CheckerTest   {   public BriefLogger ( OutputStream out )   {   super ( out , false ) ;   }   public void auditStarted ( AuditEvent evt ) { }   public void fileFinished ( AuditEvent evt ) { }     } 
public class YAMLUtil {       public static String getKey ( final YAMLKeyValue yamlKeyValue ) {   final StringBuilder builder = new StringBuilder ( ) ;   YAMLKeyValue element = yamlKeyValue ;   PsiElement parent ;     } } 
public class GestureOverlayView extends FrameLayout {   private final Rect mInvalidRect = new Rect ( ) ;   private final Path mPath = new Path ( ) ;   private boolean mGestureVisible ;   private float mX ;   private float mY ;     } 
public final class H2O {   public static volatile AbstractEmbeddedH2OConfig embeddedH2OConfig ;   public static volatile ApiIpPortWatchdogThread apiIpPortWatchdog ;   static boolean _hdfsActive = false ;     public static String VERSION = " ( unknown ) " ;       } 
public abstract class TWLayoutManager extends LayoutManager {   private int mFirstPosition ;   private int mFirstVisiblePosition ;   private boolean mIsVertical ;   private SavedState mPendingSavedState = null ;     } 
public class VolleyStreamFetcher implements ResourceFetcher < InputStream > { public void test ( ) {   VolleyRequestFuture < InputStream > localFuture = requestFuture ;   if ( localFuture != null ) {   localFuture . cancel ( true ) ;   requestFuture = null ;   }   }     } 
public class Config   { public Integer rpc_recv_buff_size_in_bytes ;   public Boolean start_native_transport = false ;   public Integer native_transport_port = 8000 ;   public Integer native_transport_min_threads = 16 ;   public Integer native_transport_max_threads = 128 ;     } 
abstract class AndroidSpringLooperFactory { public void test ( ) { { {   }   long currentTime = SystemClock . uptimeMillis ( ) ;   mSpringSystem . loop ( currentTime - mLastTime ) ;   mHandler . post ( mLooperRunnable ) ;   }   } ;     } 
public class XMLCatalogConfigurable extends BaseConfigurable {     public String getHelpTopic ( ) {   return null ;   }       } 
import javax . inject . Singleton ;     public class AppModule {   Application application ;   public AppModule ( Application application ) {   this . application = application ;     } } 
public class ServletResourceManager implements ResourceManager {     public boolean isResourceChangeListenerSupported ( ) {   return true ;   }       } 
public class LiquidStack     { public final int hashCode ( )   { {   return Objects . hashCode ( itemID , itemMeta ) ;   }       } } 
public class GridActivity extends Activity { public void test ( ) { {   mNumItems = mItemLengths . length ;   }   mGridView . setAdapter ( new MyAdapter ( ) ) ;   setContentView ( view ) ;   }     } 
public class DefaultTransaction implements Transaction {     public Transaction autoBind ( boolean autoBind ) {   this . autoBind = true ;   return this ;   }     } 
public class LFWDataFetcher extends BaseDataFetcher {     public DataSet next ( ) {   DataSet next = super . next ( ) ;   next . normalizeZeroMeanZeroUnitVariance ( ) ;   return next ;   }     } 
public class SugarRecord < T > {   public Long getId ( ) {   return id ;   }   }     
public class ClassNode extends AnnotatedNode implements Opcodes {     public void setModifiers ( int modifiers ) {   this . modifiers = modifiers ;   }   public List < PropertyNode > getProperties ( ) {     } } 
public final class AssetManager {     private int mObject ;   private int mNObject ;   private StringBlock mStringBlocks [ ] = null ;     } 
import gnu . trove . map . hash . TLongObjectHashMap ;   public class GeoIntentActivity extends OsmandListActivity {   private static final String TAG = " GeoIntentActivity " ;   private ProgressDialog progressDlg ;   private LatLon location ;     } 
public class PhoneAccount implements Parcelable {           public static final int CAPABILITY_VIDEO_CALLING = 0x8 ;       } 
public class Issue237Test {     public void testReopenSync ( ) throws InterruptedException {   File file = new File ( " test ( ) database . mapdb " ) ;   file . delete ( ) ;   DB database = DBMaker . newFileDB ( file ) . make ( ) ;     } } 
package de . appplant . cordova . plugin . localnotification ;   import java . util . Set ;   import org . json . JSONArray ;   import org . json . JSONException ;     
public abstract class SimplePool < T > {     public SimplePool ( ) {   max = 1000 ;   }   protected abstract T createNew ( ) ;     } 
import android . view . MenuItem ;   public class MainActivity extends AppCompatActivity {     protected void onCreate ( Bundle savedInstanceState ) {   super . onCreate ( savedInstanceState ) ;     } } 
public final class ActivityStackSupervisor implements DisplayListener { public void test ( ) {   }   }   class ActivityContainer extends IActivityContainer . Stub {   final int mStackId ;   IActivityContainerCallback mCallback = null ;   final ActivityStack mStack ;     } 
class NioProviderMetadata { public void test ( ) {   }   int autodetectWithoutTimeout ( ) {     final int constraintLevel ;   ExecutorService executor = Executors . newCachedThreadPool ( ) ;   boolean success ;     } } 
public class RenderScriptGL extends RenderScript { public void test ( ) { {   }   mMessageThread = new MessageThread ( this ) ;   mMessageThread . start ( ) ;   }       } 
public class ExternalAnnotationsManagerImpl extends BaseExternalAnnotationsManag     { public void run ( ) {   try {   annotationTagProcessor . process ( tag ) ;   commitChanges ( file ) ;   }   catch ( IncorrectOperationException e ) {     } } } 
public class JsonHttpResponseHandler extends TextHttpResponseHandler {   private static final String LOG_TAG = " JsonHttpResponseHandler " ;           public JsonHttpResponseHandler ( ) {     } } 
public abstract class AbstractOutputBuffer < S > implements OutputBuffer {         protected OutputBuffer outputStreamOutputBuffer ;         } 
public class PyUnboundLocalVariableInspection extends LocalInspectionTool {     public boolean isEnabledByDefault ( ) {   return false ;   }       } 
import java . awt . * ;       public abstract class ColoredListCellRenderer extends SimpleColoredComponent implements ListCellRenderer {   private boolean mySelected ;   public ColoredListCellRenderer ( ) {   setFocusBorderAroundIcon ( true ) ;     } } 
public class ItemActivity extends BaseItemActivity {     public int getCount ( ) {   return 2 ;   }       } 
public class AxolotlService implements OnAdvancedStreamFeaturesLoaded { public void test ( ) { { {   }   }   this . deviceIds . put ( jid , deviceIds ) ;   mXmppConnectionService . keyStatusUpdated ( null ) ;   }     } 
public class Box implements IBox {   public Box extendToEncompass ( Box toBeContained ) {   if ( ! toBeContained . initialized ) {   return ;   }   if ( toBeContained . xMin < xMin ) {     } } } 
public class MainService extends Service {     public void onDestroy ( ) {   unregisterReceiver ( mDialogReceiver ) ;   unregisterReceiver ( mBroadcastReceiver ) ;   MainController . destroy ( ) ;     } } 
public class AvailableGPXFragment extends OsmandExpandableListFragment {     public void onDestroyActionMode ( ActionMode mode ) {   enableSelectionMode ( false ) ;   runSelection ( false ) ;   allGpxAdapter . notifyDataSetChanged ( ) ;   }     } 
public class NewActionDialog extends DialogWrapper implements ActionData { {   return myKeyStroke ;     }   }     
public class UserScreenNameException extends PortalException {   public String getScreenName ( ) {   return _screenName ;   }   private int _exceptionType ;   private String _screenName ;     } 
public final class TransitionHelper {     public Object loadTransition ( Context context , int resId ) { {   return null ;   }   }     } 
public class DomModelTreeView extends Wrapper implements DataProvider , Disposabl   { public void dispose ( ) {   myBuilder . dispose ( ) ;   Disposer . dispose ( this ) ;   }   public SimpleTree getTree ( ) {     } } 
public class GraphTableCell {   public String getText ( ) {   return text ;   }   }     
public class Tmp { public interface OngoingStubbing < T > {               void toReturn ( T value ) ;     } } 
public abstract class OSoftThread extends Thread implements OService {   public void sendShutdown ( ) {   shutdownFlag = true ;   }   public boolean isShutdownFlag ( ) {     } } 
public class Publication implements AutoCloseable     { public long positionLimit ( )   { {   return positionLimit . getVolatile ( ) ;   }     } } 
package com . battlelancer . seriesguide ;   import com . battlelancer . seriesguide . ui . SeriesGuidePreferences ;   import com . battlelancer . seriesguide . util . ImageProvider ;   import com . battlelancer . seriesguide . util . Utils ;     
public class WebView extends AbsoluteLayout     { public void setTitleBarGravity ( int gravity ) { {   mTitleGravity = gravity ;   }       } } 
import processing . core . PApplet ;   public class WriteSVG extends PApplet {   public String sketchRenderer ( ) {     } } 
public class ImsStreamMediaProfile implements Parcelable {     public ImsStreamMediaProfile ( ) {   mAudioQuality = AUDIO_QUALITY_AMR_WB ;   mAudioDirection = DIRECTION_SEND_RECEIVE ;   mVideoQuality = VIDEO_QUALITY_NONE ;   mVideoDirection = DIRECTION_INVALID ;     } } 
public abstract class BaseSearchTestCase {       public void testSearchWithinDDMStructure ( ) throws Exception {   searchWithinDDMStructure ( ) ;   }     } 
public class AsmClassGenerator extends ClassGenerator {     public void visitTryCatchFinally ( TryCatchStatement statement ) {   onLineNumber ( statement , " visitTryCatchFinally " ) ;   visitStatement ( statement ) ;   MethodVisitor mv = controller . getMethodVisitor ( ) ;   CompileStack compileStack = controller . getCompileStack ( ) ;     } } 
public class ApplicationInfo extends PackageItemInfo implements Parcelable { public void test ( ) {   manageSpaceActivityName = orig . manageSpaceActivityName ;   descriptionRes = orig . descriptionRes ;   uiOptions = orig . uiOptions ;   }     } 
public class JournalArticleLocalServiceImpl     { public JournalArticle fetchLatestArticle (   long groupId , String articleId , int status )   throws PortalException , SystemException {   OrderByComparator orderByComparator = new ArticleVersionComparator ( ) ;     } } 
public class GoPsiImplUtil { public void test ( ) {   GoType sibling = o . findSiblingType ( ) ;   if ( sibling != null ) return sibling ;   GoType fromSpec = findTypeInConstSpec ( o ) ;   if ( fromSpec != null ) return fromSpec ;     } } 
package com . typesafe . config . impl ;   import java . io . BufferedInputStream ;   import java . io . BufferedReader ;   import java . io . File ;   import java . io . IOException ;     
public class Identity implements Transform { public void test ( ) { {   if ( other instanceof Identity ) {   return this ;   } else {   return new CombinedTransform ( this , other ) ;   }   }   }     } 
public class ResReferenceValue extends ResIntValue {     public ResReferenceValue ( ResPackage package_ , int value , boolean theme ) {   super ( value ) ;   mPackage = package_ ;   mTheme = theme ;   }     } 
public class FastArray implements Cloneable {   public Object [ ] getArray ( ) {   return data ;   }   }     
public class RajawaliRenderer implements GLSurfaceView . Renderer , INode {   public static boolean supportsUIntBuffers = false ;   private boolean mSceneInitialized ;           } 
public class BuildCraftCore extends BuildCraftMod {       public void cleanRegistries ( WorldEvent . Load load ) {   DockingStationRegistry . clear ( ) ;   }     } 
public class DevicePolicyManagerService extends IDevicePolicyManager . Stub { public void test ( ) { { { {   Slog . e ( LOG_TAG , " Failed to talk to AudioService . " , re ) ;   }   }   }   }     } 
import processing . core . PApplet ;             public class XML implements Serializable { public void test ( ) {     } } 
import voldemort . utils . Utils ;     public class ClientConfig {   private volatile int maxConnectionsPerNode = 10 ;   private volatile int maxTotalConnections = 500 ;   private volatile int maxThreads = 5 ;   private volatile int maxQueuedRequests = 50 ;     } 
public class MessageBusUtil {     public static MessageBus getMessageBus ( ) {   return getInstance ( ) . _messageBus ;   }   public static boolean hasMessageListener ( String destination ) {     } } 
class GLColorOverlay {   public void setColor ( int color ) {   mColor = color ;   }     public void destroy ( ) {   }   }     
public class Allocation extends BaseObj {                 public void setIoInputNotificationHandler ( IoInputNotifier callback ) {     } } 
public class Tmp { public enum Environment {   } public void environments ( Closure callable ) { {   if ( callable != null ) {   callable . setDelegate ( this ) ;   callable . setResolveStrategy ( Closure . DELEGATE_FIRST ) ;   callable . call ( ) ;   }   }     } } 
public class PyActiveSdkConfigurable implements UnnamedConfigurable {     public void apply ( ) throws ConfigurationException {   Sdk selectedSdk = getSelectedSdk ( ) ;   if ( selectedSdk instanceof PyDetectedSdk ) {   final String sdkName = selectedSdk . getName ( ) ;     } } } 
public class BasicOutputBuffer extends OutputBuffer {   private int _cur ;   private int _size ;   private byte [ ] _buffer = new byte [ 512 ] ;   }     
public class MediaGridAdapter extends CursorAdapter { public void test ( ) {   int placeholderResId = MediaUtils . getPlaceholder ( filepath ) ;   imageView . setErrorImageResId ( placeholderResId ) ;   imageView . setDefaultImageResId ( placeholderResId ) ;     } } 
static class SourceDebugExtensionAttribute extends Attribute {     }   static class FnExpr implements Expr {   static final String CONST_PREFIX = " const__ " ;   IPersistentCollection methods ;       } 
abstract class AbstractTFS extends FileSystem {           public abstract String getScheme ( ) ;       } 
public class ThreadWithAttributes extends Thread {       public final Hashtable getAttributes ( Object control ) { {   return attributes ;   }   }     } 
public class FakeHttpLayer { public void test ( ) { { {   }   }   return defaultHttpResponse ;   }     } 
public class TouchFeedbackDrawable extends LayerDrawable { public void test ( ) {   if ( mActiveRipplesCount >= MAX_RIPPLES ) {   Log . e ( LOG_TAG , " Max ripple count exceeded " , new RuntimeException ( ) ) ;   }   final Ripple ripple = mTouchedRipples . get ( id ) ;     } } 
class PacketReader { public void test ( ) { { {   }   }   done = true ;   }       } 
public class ParserInterpreter {     public String getGrammarFileName ( ) {   return null ;   }       } 
public class UpgradeProcessor < S > implements Processor < S > , WebConnection { public void test ( ) {   wrapper . unRead ( leftOverInput ) ;   wrapper . setReadTimeout ( INFINITE_TIMEOUT ) ;   }     } 
public class FlushableGZIPOutputStream extends GZIPOutputStream {       public void close ( ) throws IOException {   flushLastByte ( ) ;   super . close ( ) ;   }     } 
public class NutDao extends DaoSupport implements Dao { public void test ( ) {   if ( dropIfExists ) {   expert . dropEntity ( this , en ) ;   } else {   return en ;   }   }     } 
public class ComparisonFailure extends AssertionFailedError { public void test ( ) {                   } } 
public class ByteBufferList {     public ByteBuffer getAll ( ) {   read ( remaining ( ) ) ;   return remove ( ) ;   }     } 
public class RemoteViews implements Parcelable , Filter { public void test ( ) {   ViewGroup . LayoutParams layoutParams = target . getLayoutParams ( ) ;   if ( layoutParams instanceof ViewGroup . MarginLayoutParams ) {   ( ( ViewGroup . MarginLayoutParams ) layoutParams ) . setMarginEnd ( end ) ;   }   }     } 
public class EthernetDataTracker implements NetworkStateTracker { public void test ( ) { { {   mNetworkInfo . setExtraInfo ( mHwAddr ) ;   }   }   reconnect ( ) ;   break ;   }     } 
import org . json . JSONObject ;   import android . content . Intent ;   import android . net . Uri ;   import android . util . Log ;   import com . phonegap . api . Plugin ;   import com . phonegap . api . PluginResult ;     
public class FindDialog extends DialogWrapper { public void test ( ) { {   setCaretPosition ( comboBox , caretPosition ) ;   }   scheduleResultsUpdate ( ) ;   validateFindButton ( ) ;   }     } 
public class UserManager {         public boolean supportsMultipleUsers ( ) {   return getMaxSupportedUsers ( ) > 1 ;   }     } 
public class Format { {   System . exit ( - 1 ) ;     }   }     
public class Compiler extends AbstractCompiler { public void test ( ) {   InputId inputIdOnAst = newInput . getAstRoot ( this ) . getInputId ( ) ;   Preconditions . checkState ( newInput . getInputId ( ) . equals ( inputIdOnAst ) ) ;   return true ;   }     } 
public class GradientDrawable extends Drawable { public void test ( ) { { { {   }   }   mTintFilter = updateTintFilter ( mTintFilter , s . mTint , s . mTintMode ) ;   }   }     } 
public class FieldNode extends AnnotatedNode implements Opcodes , Variable {   public void setType ( ClassNode type ) {   this . type = type ;   dynamicTyped |= type == ClassHelper . DYNAMIC_TYPE ;   }     } 
public abstract class PullToRefreshBase < T extends View > extends LinearLayout { public void test ( ) {   if ( ! isRefreshing ( ) ) {   setRefreshingInternal ( doScroll ) ;   mState = MANUAL_REFRESHING ;   }   }     } 
public class BridgePowerManager implements IPowerManager {       public boolean isScreenBrightnessBoosted ( ) {   return false ;   }   }     
public class CachedClass {             public CachedClass getCachedClass ( ) {   return this ;     } } 
public final class PluginDescriptionFile {       public List < String > getLoadBefore ( ) {   return softDepend ;   }   public PluginLoadOrder getLoad ( ) {     } } 
public class AggregationOptions {   private OutputMode outputMode = OutputMode . INLINE ;   private long maxTimeMS ;   protected Builder ( ) {   }       } 
public class ViewPropertyAnimator {     public void run ( ) { {   mView . setLayerType ( View . LAYER_TYPE_HARDWARE , null ) ;   }   } ;   final int currentLayerType = mView . getLayerType ( ) ;     } 
public class SignInActivity extends FragmentActivity { public void test ( ) { {     break ;   }     }       } 
public class ShowcaseViews {     private boolean showcaseActionBar ( ItemViewProperties properties ) {   return properties . itemType >= ItemViewProperties . ID_NOT_IN_ACTIONBAR ;   }   private View . OnClickListener createShowcaseViewDismissListener ( final ShowcaseView showcaseView ) {     } } 
public class ConstructorCallExpression extends Expression {   public boolean isUsingAnonymousInnerClass ( ) {   return usesAnonymousInnerClass ;   }       public boolean isUsingAnnonymousInnerClass ( ) {   return isUsingAnonymousInnerClass ( ) ;   }   }     
public class PSurfaceJOGL implements PSurface { public void test ( ) {   caps . setNumSamples ( PGL . smoothToSamples ( graphics . smooth ) ) ;   caps . setBackgroundOpaque ( true ) ;   caps . setOnscreen ( true ) ;   pgl . capabilities = caps ;   pgl . setCaps ( caps ) ;   }     } 
public class LocalFileRequest extends UriRequest {     public void close ( ) throws IOException {   IOUtil . closeQuietly ( inputStream ) ;   inputStream = null ;   }       } 
import java . util . concurrent . locks . Lock ;         class StoreAppend extends Store { public void test ( ) {       } } 
public class RebaseErrorTopLevelBuild extends TopLevelBuild { public void test ( ) { { {   }   }   result = null ;     return result ;   }     } 
public class ConfiguringDefaultReturnValuesTest extends TestBase {     public void resetDefaultReturnValues ( ) {   MockitoConfiguration . instance ( ) . resetReturnValues ( ) ;     }   private final class MyDefaultReturnValues implements ReturnValues {     } } 
public abstract class GuiAdvancedInterface extends GuiBuildCraft { public void test ( ) { { {   int i2 = ( mouseX - cornerX ) ;   int k2 = mouseY - cornerY ;   drawCreativeTabHoveringText ( s , i2 , k2 ) ;   }   }   }     } 
public class FileContentProvider extends ContentProvider { public void test ( ) {   mFileProjectionMap . put ( ProviderTableMeta . FILE_ETAG ,   ProviderTableMeta . FILE_ETAG ) ;   mFileProjectionMap . put ( ProviderTableMeta . FILE_SHARE_BY_LINK ,   ProviderTableMeta . FILE_PUBLIC_LINK ) ;   }     } 
public abstract class BaseDDMTestCase extends PowerMockito { public void test ( ) {   ddmFormValues . setAvailableLocales (   createAvailableLocales ( LocaleUtil . US ) ) ;   ddmFormValues . setDefaultLocale ( LocaleUtil . US ) ;   return ddmFormValues ;     } } 
public class SwipeFlingAdapterView extends BaseFlingAdapterView { public void test ( ) {   mInLayout = false ;   if ( adapterCount < MIN_ADAPTER_STACK ) mFlingListener . onAdapterAboutToEmpty ( adapterCount ) ;   }     } 
public class FilterDef implements Serializable {         private Filter filter = null ;   public Filter getFilter ( ) {   return filter ;     } } 
class Tokeniser { public void test ( ) {   }   boolean isAppropriateEndTagToken ( ) {   return tagPending . tagName . equals ( lastStartTag . tagName ) ;   }     } 
public class Tmp { public interface Configuration {   } public void addProperties ( Properties properties ) ;   public boolean contains ( String key ) ;   public String get ( String key ) ;     } 
public class DBCursor implements Iterator < DBObject > , Iterable < DBObject > , Closea             { public DBObject curr ( ) {   _checkType ( CursorType . ITERATOR ) ;     } } 
public class Tmp { public void test ( ) {                 } } 
public class SvnVcs extends AbstractVcs < CommittedChangeList > {     public RootsConvertor getCustomConvertor ( ) {   return getSvnFileUrlMapping ( ) ;   }     } 
public class GoSdkType extends SdkType { public void test ( ) { { {   modificator . addRoot ( file , OrderRootType . CLASSES ) ;   modificator . addRoot ( file , OrderRootType . SOURCES ) ;   }   }   }     } 
import java . util . * ;   import jsr166y . * ;   import water . Job . JobCancelledException ;   import water . nbhm . NonBlockingHashMap ;   import water . persist . * ;   import water . util . * ;     
public class XMPPConnection {         public synchronized AccountManager getAccountManager ( ) {   if ( accountManager == null ) {   accountManager = new AccountManager ( this ) ;   }     } } 
public class AjpMessage {     public int getPacketSize ( ) {   return buf . length ;   }       public int processHeader ( boolean toContainer ) {   pos = 0 ;   int mark = getInt ( ) ;     } } 
public class TermsStatsFacetBuilder extends AbstractFacetBuilder { public void test ( ) {   builder . endObject ( ) ;   builder . endObject ( ) ;   return builder ;     } } 
public abstract class ConnectionService extends Service {               public Connection onCreateUnknownConnection ( PhoneAccountHandle connectionManagerPhoneAccount ,   ConnectionRequest request ) {     } } 
public class CameraView extends ViewGroup implements AutoFocusCallback { public void test ( ) {   removeView ( previewStrategy . getWidget ( ) ) ;   lastPictureOrientation = - 1 ;   }     } 
public class BubbleView extends FrameLayout {     public void onPageLoading ( String url ) {   showProgressBar ( true , 0 ) ;   }       } 
public class Verifier implements GroovyClassVisitor , Opcodes { public void test ( ) {   ConstructorNode dummy = new ConstructorNode ( 0 , null ) ;   addInitialization ( node , dummy ) ;   node . visitContents ( this ) ;   return ;   }     } 
public class VideoCallImpl extends VideoCall {     public void removeVideoCallListener ( ) {   mVideoCallListener = null ;   try {   mVideoProvider . removeVideoCallback ( mBinder ) ;   } catch ( RemoteException e ) {     } } } 
public final class RuntimeEnvironment {     public void setUsingLuceneLocking ( boolean useLuceneLocking ) {   threadConfig . get ( ) . setOptimizeDatabase ( useLuceneLocking ) ;   }       } 
import com . hazelcast . spi . PartitionAwareOperation ;   import java . io . IOException ;     public abstract class AbstractAtomicReferenceOperation extends Operation   implements PartitionAwareOperation , IdentifiedDataSerializable { public void test ( ) {     } } 
final public class MediaCodecList {     public static MediaCodecInfo getInfoFor ( String codec ) {   return sAllCodecInfos [ findCodecByName ( codec ) ] ;   }     } 
public class HttpBrowser { public void test ( ) {   addCookies ( httpRequest ) ;     System . out . println ( httpRequest ) ;   this . httpResponse = httpRequest . send ( ) ;   readCookies ( httpResponse ) ;     } } 
public class Tmp { public interface NearCacheStats extends LocalInstanceStats {         long getCreationTime ( ) ;       } } 
public class BookTree extends LibraryTree {   public String getSummary ( ) {   if ( ! myShowAuthors ) {   return super . getSecondString ( ) ;   }   StringBuilder builder = new StringBuilder ( ) ;   int count = 0 ;     } } 
package processing . app . windows ;   import java . io . File ;   import java . io . IOException ;   import java . io . UnsupportedEncodingException ;   import com . sun . jna . Library ;     
public class Typeface {     private Typeface ( int ni ) {   native_instance = ni ;   }     } 
public final class MediaBrowserCompat {         static class SubscriptionCallbackApi21 extends SubscriptionCallback {   SubscriptionCallback mSubscriptionCallback ;   private final Object mSubscriptionCallbackObj ;   private Bundle mOptions ;     } } 
public class TwitterRestClient {     public static void post ( String url , RequestParams params , AsyncHttpResponseHandler responseHandler ) {   client . get ( getAbsoluteUrl ( url ) , params , responseHandler ) ;   }   private static String getAbsoluteUrl ( String relativeUrl ) {     } } 
public class TestHttp2Section_4_2 extends Http2TestBase { public void test ( ) {     http2Connect ( ) ;     byte [ ] ping = new byte [ 9 ] ;       } } 
public class RepeatedRaptorProfileRouter {   public static final int MAX_DURATION = 60 * 60 * 2 ;   private static final int MAX_TRANSFERS = 20 ;     public ProfileRequest request ;   public Graph graph ;     } 
public class LiferayLocalRepository     { public void deleteAll ( ) throws PortalException , SystemException { {   dlFileEntryTypeLocalService . deleteFileEntryTypes ( getGroupId ( ) ) ;     dlFolderLocalService . deleteAll ( getGroupId ( ) ) ;   }     } } 
public final class DirectedAcyclicGraphTest { public void test ( ) {   mGraph = new DirectedAcyclicGraph < > ( ) ;   }             } 
public class CleanupOperationTest { public void test ( ) {   CleanupOperationOptions options = new CleanupOperationOptions ( ) ;   options . setRemoveOldVersions ( false ) ;   options . setMinSecondsBetweenCleanups ( 40000000 ) ;       } } 
import org . codehaus . groovy . syntax . Types ;   import java . io . BufferedWriter ;   import java . io . IOException ;   import java . io . Writer ;   import java . net . MalformedURLException ;   import java . net . URL ;   import java . util . * ;     
public final class AccessibilityEvent implements Parcelable { public void test ( ) {   mPackageName = null ;   mContentDescription = null ;   mBeforeText = null ;   mText . clear ( ) ;   }     } 
public class MapRoutePreferencesControl extends MapControls {     public void hideControls ( FrameLayout layout ) {   removeButton ( layout , settingsAppModeButton ) ;   layout . removeView ( settingsAppModeButton ) ;   mapActivity . accessibleContent . remove ( settingsAppModeButton ) ;   }       } 
public class JetContentBasedFileSubstitutor implements ContentBasedClassFileProc         { public PsiFile getDecompiledPsiFile ( PsiFile psiFile ) { {   return JetDecompiledData . getDecompiledData ( ( ClsFileImpl ) psiFile ) . getJetFile ( ) ;   }     } } 
public abstract class TileMachine extends TileBuildCraft implements IMachine , IP     { public int powerRequest ( ) {   if ( isActive ( ) ) {   return getPowerProvider ( ) . getMaxEnergyReceived ( ) ;   } else {   return 0 ;   }     } } 
public class BaseObj { public void test ( ) {   if ( this == obj )   return true ;   if ( getClass ( ) != obj . getClass ( ) ) {   return false ;   }     } } 
class ExitTransitionCoordinator extends ActivityTransitionCoordinator {     private static SharedElementListener getListener ( Activity activity , boolean isReturning ) {   return isReturning ? activity . mExitTransitionListener : activity . mEnterTransitionListener ;   }       } 
public abstract class HardwareRenderer {   public static boolean sSystemRendererDisabled = false ;     public static boolean sUseRenderThread = true ;   private boolean mEnabled ;   private boolean mRequested = true ;     } 
import org . junit . runner . RunWith ;   public class CompositeRunnerTest {   public static class CompositeWithClass extends CompositeRunner {   } public CompositeWithClass ( Class < ? > type ) { {   super ( type ) ;   }   }     } 
public class ViewPropertyAnimator { public void test ( ) {   NameValuesHolder nameValuePair = new NameValuesHolder ( constantName , startValue , byValue ) ;   mPendingAnimations . add ( nameValuePair ) ;   mView . removeCallbacks ( mAnimationStarter ) ;   mView . post ( mAnimationStarter ) ;   }       } 
public class ContextImpl implements Context . Impl {     public Map < String , FileItem [ ] > getParameterFileItems ( ) {   return fileFieldsMap ;   }     } 
public class RoutingHelper { public void test ( ) { { {   }   formattedStreetName = formattedStreetName + towards + " " + destination ;   }   return formattedStreetName ;   }     } 
public class DataStructures {   private static String string = null ;   private static boolean debug = false ;   private static boolean debugTime = false ;   private static boolean validate = true ;   public static void main ( String [ ] args ) {     } } 
abstract class CommunicationProtocol   { public void test ( ) { { {   dest . writeBytes ( bytes ) ;   }   }   }     } 
public class Tmp { public interface ResolutionStrategy {               void preferProjectModules ( ) ;     } } 
public abstract class Visibility extends Transition {   private static final String [ ] sTransitionProperties = {   PROPNAME_VISIBILITY ,   } ;   private static class VisibilityInfo {     } } 
public class NumberProgressBar extends View {   private static final String INSTANCE_TEXT_VISBILITY = " text_visibility " ;   private static final int PROGRESS_TEXT_VISIBLE = 0 ;   private static final int PROGRESS_TEXT_INVISIBLE = 1 ;         } 
class GitPushTargetPanel extends PushTargetPanel < GitPushTarget > {     public void fireOnChange ( ) {   if ( myError == null ) {   return ;   }   String remoteName = myRemoteLabel . getText ( ) ;     } } 
public class Liquibase {     public Database getDatabase ( ) {   return database ;   }     } 
public class CodeStyleImportsPanel extends JPanel {     public boolean isModified ( ) {   stopTableEditing ( ) ;   boolean isModified = isModified ( myCbUseFQClassNames , mySettings . USE_FQ_CLASS_NAMES ) ;   isModified |= isModified ( myCbUseFQClassNamesInJavaDoc , mySettings . USE_FQ_CLASS_NAMES_IN_JAVADOC ) ;     } } 
public class ShelvedChangesViewManager implements ProjectComponent {     public void projectOpened ( ) {   }   public void projectClosed ( ) {     } } 
public class BubbleDraggable extends BubbleView implements Draggable {   public void destroy ( ) {     mDraggableHelper . destroy ( ) ;   }     } 
