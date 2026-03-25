<p align="center">
  <img src="https://img.shields.io/badge/🚨-RAKSHAK-dc2626?style=for-the-badge&labelColor=1e1e1e&logo=data:image/svg+xml;base64,PHN2ZyB4bWxucz0iaHR0cDovL3d3dy53My5vcmcvMjAwMC9zdmciIHdpZHRoPSIyNCIgaGVpZ2h0PSIyNCIgdmlld0JveD0iMCAwIDI0IDI0IiBmaWxsPSIjZmZmIj48cGF0aCBkPSJNMTIgMkM2LjQ4IDIgMiA2LjQ4IDIgMTJzNC40OCAxMCAxMCAxMCAxMC00LjQ4IDEwLTEwUzE3LjUyIDIgMTIgMnptMCAxOGMtNC40MSAwLTgtMy41OS04LThzMy41OS04IDgtOCA4IDMuNTkgOCA4LTMuNTkgOC04IDh6Ii8+PC9zdmc+" alt="Rakshak" />
</p>

<h1 align="center">RAKSHAK — रक्षक</h1>
<h3 align="center">Real-Time Disaster Resource Coordination Platform</h3>

<p align="center">
  <em>When every second counts, coordination saves lives.</em>
</p>

<p align="center">
  <img src="https://img.shields.io/badge/Hackatron_3.0-BIT_Sindri-blue?style=flat-square" />
  <img src="https://img.shields.io/badge/Track-Disaster_Management-red?style=flat-square" />
  <img src="https://img.shields.io/badge/Status-In_Development-orange?style=flat-square" />
</p>

<p align="center">
  <img src="https://img.shields.io/badge/React-20232A?style=flat-square&logo=react&logoColor=61DAFB" />
  <img src="https://img.shields.io/badge/Node.js-339933?style=flat-square&logo=nodedotjs&logoColor=white" />
  <img src="https://img.shields.io/badge/MongoDB-47A248?style=flat-square&logo=mongodb&logoColor=white" />
  <img src="https://img.shields.io/badge/Socket.IO-010101?style=flat-square&logo=socketdotio&logoColor=white" />
  <img src="https://img.shields.io/badge/Python-3776AB?style=flat-square&logo=python&logoColor=white" />
  <img src="https://img.shields.io/badge/TensorFlow-FF6F00?style=flat-square&logo=tensorflow&logoColor=white" />
</p>

---

## 🔴 The Problem

India recorded extreme weather events on **331 out of 334 days** in 2025. Over **4,400 lives lost**. Millions displaced. Yet disaster response remains **fragmented** — agencies duplicate efforts, affected people can't reach help, and communication collapses precisely when it matters most.

There is **no unified, real-time coordination platform** that works for victims, volunteers, and coordinators — especially in **low-connectivity environments** where infrastructure has been destroyed.

**Rakshak** changes that.

---

## 💡 What is Rakshak?

Rakshak (रक्षक — "The Protector") is an **AI-powered, offline-first, real-time disaster resource coordination platform** that seamlessly connects:

| Layer | For Whom | What It Does |
|-------|----------|-------------|
| 🆘 **User Interaction** | Affected Individuals | One-tap SOS, voice-based emergency reporting, nearby shelter finder |
| 🤝 **Operational Participation** | Volunteers & Field Workers | Task queue, real-time location, resource tracking, skill-based matching |
| 🎛️ **Coordination & Management** | NGO Coordinators & Admins | Command center dashboard, AI resource allocation, inter-agency coordination |

---

## ✨ Features

### 🔥 Core Platform

- **One-Tap SOS** — Send a distress signal with GPS location in 2 taps. Works offline.
- **Multi-Role System** — Separate interfaces for victims, volunteers, coordinators, and admins with RBAC.
- **Real-Time Dashboard** — Live map with all incidents, resources, volunteers, and shelters.
- **Task Assignment Engine** — Auto-assign volunteers based on proximity, skills, and availability.
- **Resource Inventory Tracker** — Track food, water, medicine, and shelter across all distribution points.
- **Family Reunion Board** — Missing person reports and safe-status updates to reconnect families.

---

### 📍 Proximity-Based Disaster Alerts (Geo-Fenced Notifications)

When a disaster is reported in an area, **Rakshak doesn't just help the reporter — it proactively alerts everyone nearby.**

```
┌─────────────────────────────────────────────────────┐
│                  DISASTER REPORTED                   │
│              📍 Flood in Sector 12                   │
│                                                     │
│    ┌───────────────────────────────┐                │
│    │  🔴 DANGER ZONE (0-2 km)     │                │
│    │  Immediate evacuation alert   │                │
│    │  + shelter directions         │                │
│    │                               │                │
│    │  🟠 WARNING ZONE (2-5 km)    │                │
│    │  Stay alert + prepare to      │                │
│    │  evacuate + avoid routes      │                │
│    │                               │                │
│    │  🟡 WATCH ZONE (5-15 km)     │                │
│    │  Be aware + stock essentials  │                │
│    │  + monitor updates            │                │
│    └───────────────────────────────┘                │
│                                                     │
│  All app users in these zones get push + SMS alerts │
└─────────────────────────────────────────────────────┘
```

**How it works:**

- Every incident has a **geo-fence radius** auto-calculated based on disaster type (flood = larger radius, fire = smaller but fast-expanding).
- All registered users within the radius receive **tiered push notifications** based on their distance from the epicenter.
- Notifications include: **what happened**, **what to do**, **nearest safe route**, and **nearest shelter**.
- Radius **dynamically expands** as the disaster evolves (e.g., flood waters rising → expanding alert zone).
- Users who enter a disaster zone after the initial alert **get notified immediately** upon entering the geo-fence.
- Works via **push notifications** (online), **SMS** (cellular only), and **mesh broadcast** (fully offline).

---

### 🎙️ AI Emergency Call Analyzer — The Killer Feature

This is what makes Rakshak truly intelligent. When someone calls the emergency line or records a voice SOS, the system **doesn't just record it — it understands it, extracts data, and acts on it.**

#### 📞 How the Call Pipeline Works

```
┌──────────────┐    ┌──────────────┐    ┌──────────────┐    ┌──────────────┐
│  INCOMING     │    │  SPEECH TO   │    │  NLP ENTITY  │    │  ENRICHMENT  │
│  VOICE CALL   │───▶│  TEXT (STT)  │───▶│  EXTRACTION  │───▶│  & ACTION    │
│  / Voice SOS  │    │  Engine      │    │  Engine      │    │  Engine      │
└──────────────┘    └──────────────┘    └──────────────┘    └──────────────┘
       │                    │                   │                    │
       ▼                    ▼                   ▼                    ▼
  Audio Stream         Raw Text            Structured          Enriched Data
  + Metadata        + Confidence          JSON with:          + Matched Location
  + Caller ID        + Language           - disaster_type     + Nearest Resources
                     Detection            - location_clue     + Auto-Priority
                                          - people_count      + Assigned Team
                                          - urgency_keywords
                                          - caller_emotion
```

#### Step 1: Voice → Text (Real-Time STT)

```python
# Supports Hindi, English, Bengali, and mixed-code speech
# Uses Whisper / Google Speech API with Indian accent optimization

Input Audio: "भैया please help! स्कूल में आग लग गई है! 
              बच्चे अंदर फंसे हैं! Kendriya Vidyalaya के पास!"

Output Text: "bhaiya please help! school mein aag lag gayi hai! 
              bachche andar fanse hain! kendriya vidyalaya ke paas!"

Detected Language: Hindi-English (Code-Mixed)
Confidence: 94.2%
```

#### Step 2: Urgency Scoring from Voice Tone + Words

The system analyzes **BOTH what they say AND how they say it** to prioritize calls:

```
┌─────────────────────────────────────────────────────────┐
│              URGENCY SCORING MODEL                      │
│                                                         │
│  📊 VOICE TONE ANALYSIS (40% weight)                   │
│  ├── Speech rate (fast = more urgent)                   │
│  ├── Pitch variation (screaming/crying = critical)      │
│  ├── Volume spikes (shouting = emergency)               │
│  ├── Trembling/shaking voice detection                  │
│  └── Background noise classification                    │
│      (fire crackling, water rushing, screams)           │
│                                                         │
│  📝 KEYWORD ANALYSIS (40% weight)                      │
│  ├── Disaster keywords: fire, flood, earthquake,        │
│  │   trapped, collapsed, drowning, landslide            │
│  ├── Urgency amplifiers: "dying", "children",           │
│  │   "please help", "can't breathe", "bleeding"        │
│  ├── Scale indicators: "entire building",               │
│  │   "whole village", "hundreds of people"              │
│  └── Negation detection: "no water", "no exit",         │
│      "can't move", "no network"                         │
│                                                         │
│  👥 CONTEXTUAL FACTORS (20% weight)                    │
│  ├── Number of people mentioned                         │
│  ├── Vulnerable groups (children, elderly, disabled)    │
│  ├── Infrastructure at risk (school, hospital, bridge)  │
│  └── Time sensitivity ("water rising", "fire spreading")│
│                                                         │
│  ═══════════════════════════════════════════════════    │
│  FINAL SCORE: 0-100 → Priority Level                    │
│  🔴 CRITICAL (80-100)  → Immediate dispatch             │
│  🟠 HIGH (60-79)       → Priority queue                 │
│  🟡 MEDIUM (40-59)     → Standard response              │
│  🟢 LOW (0-39)         → Monitored & queued             │
└─────────────────────────────────────────────────────────┘
```

#### Step 3: NLP Entity Extraction — Understanding the Situation

From the transcribed text, the AI extracts **structured, actionable data**:

```json
{
  "call_id": "CALL-20260405-0847",
  "raw_transcript": "bhaiya please help! school mein aag lag gayi hai! bachche andar fanse hain! kendriya vidyalaya ke paas!",
  "extracted_entities": {
    "disaster_type": "FIRE",
    "disaster_confidence": 0.97,
    "location_clues": ["school", "kendriya vidyalaya"],
    "people_status": {
      "trapped": true,
      "count_estimate": "multiple (bachche = children, plural)",
      "vulnerable_group": "CHILDREN"
    },
    "urgency_keywords": ["help", "aag (fire)", "fanse (trapped)"],
    "caller_emotion": "PANIC",
    "language": "hi-en (code-mixed)"
  },
  "urgency_score": 94,
  "priority": "CRITICAL",
  "auto_actions_triggered": [
    "FIRE_RESPONSE_TEAM_DISPATCHED",
    "NEAREST_HOSPITAL_ALERTED",
    "GEO_FENCE_ALERT_RADIUS_2KM"
  ]
}
```

#### Step 4: Smart Location Resolution — "School Near Me" → Exact Coordinates

When someone says **"there's a fire in the school near me"**, the system doesn't stop at "school" — it **resolves the actual location**:

```
┌────────────────────────────────────────────────────┐
│         LOCATION RESOLUTION PIPELINE               │
│                                                    │
│  Input clue: "kendriya vidyalaya ke paas"          │
│  Caller GPS: 23.7957° N, 86.4304° E (Dhanbad)     │
│                                                    │
│  Step 1: Extract location keywords                 │
│  → ["kendriya vidyalaya", "school"]                │
│                                                    │
│  Step 2: Query OpenStreetMap / Google Places API   │
│  → Search "Kendriya Vidyalaya" within 5km of       │
│    caller's GPS coordinates                        │
│                                                    │
│  Step 3: Rank results by proximity                 │
│  ┌──────────────────────────────────────────┐      │
│  │ 1. KV Dhanbad (0.8 km) ← MOST LIKELY   │      │
│  │ 2. KV Sindri (4.2 km)                   │      │
│  │ 3. KV Jharia (6.1 km)                   │      │
│  └──────────────────────────────────────────┘      │
│                                                    │
│  Step 4: Cross-validate with known disaster        │
│  hotspots and recent incident reports              │
│                                                    │
│  Step 5: Enrich with metadata                      │
│  → Building type: School (PRIORITY: HIGH)          │
│  → Capacity: ~800 students                         │
│  → Nearest fire station: 1.2 km                    │
│  → Nearest hospital: 2.4 km                        │
│  → Access roads: NH-2 (clear), Station Rd (clear)  │
│                                                    │
│  ✅ RESOLVED: KV Dhanbad, 23.7961°N, 86.4312°E   │
│  ✅ Confidence: 91%                                │
│  ✅ Response team ETA: ~4 minutes                  │
└────────────────────────────────────────────────────┘
```

#### Step 5: Data Elaboration — Maximum Info in Minimum Time

The entire pipeline runs in **under 8 seconds** from call start to actionable intelligence:

```
Timeline of a 30-second emergency call:
━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━

 0s ──── Call connected, audio streaming begins
 2s ──── Language detected (Hindi-English)
 3s ──── First urgency spike detected (voice tone)
 5s ──── "aag" (fire) keyword → disaster type locked
 6s ──── "school" + "kendriya vidyalaya" → location search triggered
 7s ──── "bachche fanse" (children trapped) → CRITICAL priority
 8s ──── ⚡ FIRST ACTIONABLE ALERT SENT TO DASHBOARD
         ├── Fire response team auto-notified
         ├── Nearest hospital on standby
         └── Geo-fence alerts sent to 2km radius
12s ──── Location resolved: KV Dhanbad (91% confidence)
15s ──── Enriched data: building capacity, access roads, resources
20s ──── Full situation card visible on admin dashboard
30s ──── Call ends. Complete transcript + analysis stored.

Total time from call → first responder dispatch: ~8 seconds
Traditional method (manual call center): ~3-5 minutes
```

---

### 🛡️ Admin Command Center

Admins and coordinators get a **God-view dashboard** with everything they need:

```
┌─────────────────────────────────────────────────────────────┐
│  🎛️ RAKSHAK COMMAND CENTER                    🔴 LIVE      │
├─────────────────────────────────────────────────────────────┤
│                                                             │
│  ┌─────────────────────────────┐  ┌──────────────────────┐ │
│  │       LIVE INCIDENT MAP     │  │   ACTIVE INCIDENTS   │ │
│  │                             │  │                      │ │
│  │    🔴 Fire - KV Dhanbad    │  │  🔴 12 Critical      │ │
│  │    🟠 Flood - Sector 5     │  │  🟠 28 High          │ │
│  │    🟡 Landslide - NH2      │  │  🟡 45 Medium        │ │
│  │    🔵 Volunteers (47)      │  │  🟢 89 Resolved      │ │
│  │    🟢 Shelters (12)        │  │                      │ │
│  │                             │  │  Avg Response: 4.2m  │ │
│  └─────────────────────────────┘  └──────────────────────┘ │
│                                                             │
│  ┌─────────────────────────────┐  ┌──────────────────────┐ │
│  │     CALLER INTELLIGENCE     │  │   RESOURCE STATUS    │ │
│  │                             │  │                      │ │
│  │  📞 Last Call: 12s ago      │  │  Water: ████░░ 67%  │ │
│  │  📍 KV Dhanbad (91%)       │  │  Food:  █████░ 83%  │ │
│  │  🔥 Type: FIRE             │  │  Meds:  ███░░░ 45%  │ │
│  │  👶 Children trapped       │  │  Beds:  ██░░░░ 34%  │ │
│  │  🎙️ Urgency: 94/100       │  │                      │ │
│  │  📊 Tone: PANIC            │  │  ⚠️ Medicine LOW    │ │
│  │  🏥 Hospital: 2.4 km       │  │  ⚠️ Shelter beds LOW│ │
│  │  🚒 Fire Stn: 1.2 km       │  │                      │ │
│  │  [▶ Play Audio] [📄 Full]  │  │  [Request Resupply]  │ │
│  └─────────────────────────────┘  └──────────────────────┘ │
│                                                             │
│  ┌──────────────────────────────────────────────────────┐  │
│  │  📋 RECENT CALL ANALYSIS FEED                        │  │
│  │                                                      │  │
│  │  08:47 🔴 FIRE | KV Dhanbad | Children trapped |     │  │
│  │        Score: 94 | Team Alpha dispatched | ETA: 4m   │  │
│  │                                                      │  │
│  │  08:43 🟠 FLOOD | Sector 5 Jharia | 15 families |    │  │
│  │        Score: 72 | Boats requested | Shelter: Open   │  │
│  │                                                      │  │
│  │  08:38 🟡 ROAD BLOCKED | NH2 Govindpur | Landslide | │  │
│  │        Score: 51 | Alt route shared | Clearing crew   │  │
│  └──────────────────────────────────────────────────────┘  │
│                                                             │
│  [📊 Analytics] [📢 Broadcast Alert] [📥 Export SITREP]    │
└─────────────────────────────────────────────────────────────┘
```

**What admins can see for each caller / incident:**

| Data Point | Source | Purpose |
|------------|--------|---------|
| 📍 Caller GPS Location | Device GPS / Cell tower | Pinpoint on map, dispatch nearest team |
| 🎙️ Call Audio + Transcript | STT Engine | Review, verify, extract missed info |
| 📊 Urgency Score & Breakdown | AI Tone + NLP Analysis | Prioritize response queue |
| 🏷️ Extracted Entities | NLP Pipeline | Disaster type, people count, vulnerable groups |
| 🗺️ Resolved Location | Places API + GPS cross-ref | Exact building/area identified |
| 📱 Device Metadata | App telemetry | Battery %, network type, offline status |
| 🔗 Linked Incidents | Deduplication Engine | Merge duplicate reports from same event |
| ⏱️ Timeline | System logs | When reported → analyzed → dispatched → resolved |

---

### 🌐 Offline-First Architecture

```
┌──────────────────────────────────────────────────────┐
│            CONNECTIVITY FALLBACK CHAIN                │
│                                                      │
│  FULL INTERNET ──→ LOW BANDWIDTH ──→ SMS ONLY ──→ OFFLINE
│       │                 │               │              │
│   WebSocket         Compressed       SMS-based      Bluetooth
│   + REST API        text-only        SOS via        mesh P2P
│   + Live Maps       + queued         shortcode      + local
│   + Video           uploads          + USSD         storage
│                                      menu           + sync
│                                                     later
│                                                      │
│   ◄──────── AUTO-DETECTS & SWITCHES ────────────►   │
└──────────────────────────────────────────────────────┘
```

---

## 🏗️ System Architecture

```
                            ┌─────────────────┐
                            │   LOAD BALANCER  │
                            └────────┬────────┘
                                     │
                    ┌────────────────┼────────────────┐
                    │                │                 │
             ┌──────▼──────┐  ┌─────▼──────┐  ┌──────▼──────┐
             │   API SERVER │  │  WEBSOCKET │  │   AI/ML     │
             │  (Express.js)│  │  (Socket.IO)│  │  (Flask)    │
             └──────┬──────┘  └─────┬──────┘  └──────┬──────┘
                    │               │                 │
                    │    ┌──────────┘                 │
                    │    │                            │
             ┌──────▼────▼──────┐            ┌───────▼───────┐
             │     MongoDB      │            │  AI Pipeline  │
             │  ┌────────────┐  │            │ ┌───────────┐ │
             │  │  incidents │  │            │ │   Whisper  │ │
             │  │  users     │  │            │ │   STT      │ │
             │  │  resources │  │            │ ├───────────┤ │
             │  │  tasks     │  │            │ │   NLP      │ │
             │  │  calls     │  │            │ │   Entity   │ │
             │  │  shelters  │  │            │ │   Extract  │ │
             │  └────────────┘  │            │ ├───────────┤ │
             └──────────────────┘            │ │   Tone     │ │
                                             │ │   Analyzer │ │
             ┌──────────────────┐            │ ├───────────┤ │
             │      Redis       │            │ │  Location  │ │
             │  (Cache + PubSub │            │ │  Resolver  │ │
             │   + Geo Queries) │            │ └───────────┘ │
             └──────────────────┘            └───────────────┘
                                                     │
                    ┌────────────────────────────────┘
                    │
             ┌──────▼──────────┐
             │  EXTERNAL APIs  │
             │  ├─ Google Maps  │
             │  ├─ OSM / Places│
             │  ├─ Twilio (SMS)│
             │  ├─ Weather API │
             │  └─ IMD Alerts  │
             └─────────────────┘
```

---

## 📁 Project Structure

```
rakshak/
├── client/                          # React PWA Frontend
│   ├── public/
│   │   ├── manifest.json            # PWA manifest
│   │   ├── sw.js                    # Service worker (offline caching)
│   │   └── offline-tiles/           # Cached map tiles
│   ├── src/
│   │   ├── components/
│   │   │   ├── sos/
│   │   │   │   ├── SOSButton.jsx          # One-tap SOS trigger
│   │   │   │   ├── VoiceRecorder.jsx      # Voice SOS recording
│   │   │   │   └── OfflineQueue.jsx       # Queued offline reports
│   │   │   ├── map/
│   │   │   │   ├── DisasterMap.jsx        # Leaflet live map
│   │   │   │   ├── GeoFenceOverlay.jsx    # Alert zone visualization
│   │   │   │   └── HeatmapLayer.jsx       # Incident density heatmap
│   │   │   ├── volunteer/
│   │   │   │   ├── TaskDashboard.jsx      # Incoming task queue
│   │   │   │   ├── LocationSharing.jsx    # Live GPS tracking
│   │   │   │   └── ResourceScanner.jsx    # QR-based supply tracking
│   │   │   ├── admin/
│   │   │   │   ├── CommandCenter.jsx      # Main admin dashboard
│   │   │   │   ├── CallAnalytics.jsx      # Call analysis feed
│   │   │   │   ├── CallerIntelCard.jsx    # Per-caller intelligence view
│   │   │   │   ├── ResourceOptimizer.jsx  # AI allocation dashboard
│   │   │   │   └── AlertBroadcast.jsx     # Mass notification sender
│   │   │   └── common/
│   │   │       ├── Navbar.jsx
│   │   │       ├── LanguageSwitcher.jsx   # Hindi / English / Bengali
│   │   │       └── NotificationBanner.jsx
│   │   ├── hooks/
│   │   │   ├── useSocket.js               # WebSocket connection
│   │   │   ├── useGeoLocation.js          # GPS tracking
│   │   │   ├── useOfflineSync.js          # PouchDB sync logic
│   │   │   └── useMeshNetwork.js          # BLE mesh communication
│   │   ├── services/
│   │   │   ├── api.js                     # Axios API client
│   │   │   ├── pouchdb.js                 # Offline-first database
│   │   │   └── meshService.js             # Bluetooth mesh relay
│   │   ├── context/
│   │   │   ├── AuthContext.jsx
│   │   │   └── DisasterContext.jsx
│   │   ├── utils/
│   │   │   ├── priorityScorer.js          # Client-side urgency calc
│   │   │   └── geoFence.js                # Geo-fence hit detection
│   │   └── App.jsx
│   ├── tailwind.config.js
│   └── package.json
│
├── server/                          # Node.js Backend
│   ├── config/
│   │   ├── db.js                    # MongoDB connection
│   │   ├── redis.js                 # Redis connection
│   │   └── socket.js                # Socket.IO setup
│   ├── models/
│   │   ├── User.js
│   │   ├── Incident.js
│   │   ├── Resource.js
│   │   ├── Task.js
│   │   ├── Shelter.js
│   │   ├── CallRecord.js           # Emergency call logs + analysis
│   │   └── AuditLog.js
│   ├── routes/
│   │   ├── auth.routes.js
│   │   ├── incident.routes.js
│   │   ├── resource.routes.js
│   │   ├── task.routes.js
│   │   ├── shelter.routes.js
│   │   ├── call.routes.js           # Call analysis endpoints
│   │   ├── alert.routes.js          # Geo-fenced alert broadcasting
│   │   └── dashboard.routes.js
│   ├── middleware/
│   │   ├── auth.js                  # JWT verification
│   │   ├── rbac.js                  # Role-based access control
│   │   └── rateLimiter.js
│   ├── services/
│   │   ├── geoFenceService.js       # Proximity alert engine
│   │   ├── deduplicationService.js  # Duplicate report detection
│   │   ├── smsGateway.js            # Twilio SMS integration
│   │   └── notificationService.js   # Push + SMS + Mesh alerts
│   ├── sockets/
│   │   ├── incidentSocket.js        # Real-time incident updates
│   │   ├── volunteerSocket.js       # Volunteer location tracking
│   │   └── alertSocket.js           # Live alert broadcasting
│   ├── server.js
│   └── package.json
│
├── ai-service/                      # Python AI/ML Microservice
│   ├── app.py                       # Flask API server
│   ├── modules/
│   │   ├── stt_engine.py            # Speech-to-Text (Whisper)
│   │   ├── tone_analyzer.py         # Voice urgency/emotion analysis
│   │   ├── nlp_extractor.py         # Entity extraction from transcript
│   │   ├── location_resolver.py     # "school near me" → exact coords
│   │   ├── severity_classifier.py   # Disaster severity scoring
│   │   ├── deduplication.py         # Geo-spatial + NLP dedup
│   │   ├── resource_optimizer.py    # AI resource allocation
│   │   └── social_monitor.py        # Twitter/X disaster feed monitor
│   ├── models/
│   │   ├── urgency_model.pkl        # Trained urgency classifier
│   │   └── disaster_ner.pkl         # Named entity recognition model
│   ├── requirements.txt
│   └── Dockerfile
│
├── docker-compose.yml
├── .env.example
├── LICENSE
└── README.md                        # ← You are here
```

---
## UI
<img width="1600" height="1256" alt="Image" src="https://github.com/user-attachments/assets/821c038f-4f22-409d-8da9-887bbd6d83a6" />
## 🚀 Quick Start

### Prerequisites

- Node.js 18+
- Python 3.10+
- MongoDB 6+
- Redis 7+

### Installation

```bash
# Clone the repository
git clone https://github.com/your-team/rakshak.git
cd rakshak

# Setup environment variables
cp .env.example .env
# Edit .env with your API keys (Twilio, Google Maps, etc.)

# Install & start backend
cd server
npm install
npm run dev

# Install & start frontend (new terminal)
cd client
npm install
npm start

# Install & start AI service (new terminal)
cd ai-service
pip install -r requirements.txt
python app.py
```

### Environment Variables

```env
# Database
MONGODB_URI=mongodb://localhost:27017/rakshak
REDIS_URL=redis://localhost:6379

# Auth
JWT_SECRET=your-secret-key

# APIs
GOOGLE_MAPS_API_KEY=your-key
TWILIO_SID=your-sid
TWILIO_AUTH_TOKEN=your-token
TWILIO_PHONE_NUMBER=+91XXXXXXXXXX

# AI Service
AI_SERVICE_URL=http://localhost:5000
WHISPER_MODEL=small    # small for hackathon, large for production

# Alerts
GEO_FENCE_DEFAULT_RADIUS_KM=5
ALERT_SMS_ENABLED=true
```

---

## 🧪 API Endpoints

### Auth
| Method | Endpoint | Description |
|--------|----------|-------------|
| POST | `/api/auth/register` | Register (victim/volunteer/coordinator/admin) |
| POST | `/api/auth/login` | JWT token generation |

### Incidents
| Method | Endpoint | Description |
|--------|----------|-------------|
| POST | `/api/incidents` | Create SOS / incident report |
| GET | `/api/incidents` | List with filters (type, severity, status, geo) |
| PUT | `/api/incidents/:id/assign` | Assign volunteer |
| PUT | `/api/incidents/:id/resolve` | Mark resolved |

### Call Analysis
| Method | Endpoint | Description |
|--------|----------|-------------|
| POST | `/api/calls/analyze` | Upload audio → full AI analysis pipeline |
| GET | `/api/calls/:id/transcript` | Get transcript + entities |
| GET | `/api/calls/:id/urgency` | Get urgency score breakdown |
| GET | `/api/calls/feed` | Live call analysis feed for admin |

### Alerts
| Method | Endpoint | Description |
|--------|----------|-------------|
| POST | `/api/alerts/geo-broadcast` | Send alert to users in geo-fence |
| POST | `/api/alerts/broadcast` | Mass notification by role/area |

### Resources & Shelters
| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | `/api/resources` | Current resource inventory |
| POST | `/api/resources/allocate` | AI-optimized allocation |
| GET | `/api/shelters/nearby` | Shelters within radius |

### WebSocket Events
| Event | Direction | Description |
|-------|-----------|-------------|
| `incident:new` | Server → Client | New incident reported |
| `incident:update` | Bidirectional | Status change |
| `alert:geofence` | Server → Client | Proximity disaster alert |
| `volunteer:location` | Client → Server | Live GPS update |
| `call:analyzed` | Server → Admin | New call analysis ready |

---

## 🛠️ Tech Stack

| Layer | Technology | Why |
|-------|-----------|-----|
| **Frontend** | React 18 + Tailwind CSS | Component-based; rapid UI; responsive |
| **PWA** | Service Workers + Workbox | Offline caching; installable; push notifications |
| **Maps** | Leaflet.js + OpenStreetMap | Free; offline tile support; lightweight |
| **Backend** | Node.js + Express.js | Fast prototyping; WebSocket support; large ecosystem |
| **Real-Time** | Socket.IO | Bidirectional events; auto-reconnect; room-based |
| **Database** | MongoDB + Mongoose | Schema-flexible; geo-queries; rapid iteration |
| **Cache** | Redis | Pub/sub for real-time; geo-fence queries; session cache |
| **Offline Sync** | PouchDB → CouchDB | Built-in conflict resolution; auto-sync on reconnect |
| **AI/STT** | OpenAI Whisper (small) | Best multilingual STT; runs locally; Hindi support |
| **AI/NLP** | spaCy + Custom NER | Fast entity extraction; trainable for disaster vocab |
| **AI/Tone** | librosa + scikit-learn | Audio feature extraction; emotion classification |
| **SMS** | Twilio API | Reliable SMS gateway; Indian number support |
| **Auth** | JWT + bcrypt | Stateless; role-based; secure |
| **Deployment** | Vercel + Railway | Free tiers; fast deployment; auto-scaling |

---

## 📊 Database Schema

```javascript
// CallRecord — The emergency call analysis record
{
  _id: ObjectId,
  callerId: ObjectId,              // ref: User
  incidentId: ObjectId,            // ref: Incident (auto-created)
  audioUrl: String,                // stored audio file
  
  // STT Output
  transcript: String,
  language: String,                // "hi", "en", "hi-en"
  sttConfidence: Number,
  
  // Tone Analysis
  toneAnalysis: {
    speechRate: Number,            // words per minute
    pitchMean: Number,
    pitchVariance: Number,
    volumeSpikes: Number,
    emotion: String,               // "panic", "calm", "crying", "shouting"
    emotionConfidence: Number,
    backgroundNoise: [String]      // ["fire", "water", "crowd", "sirens"]
  },
  
  // NLP Extraction
  entities: {
    disasterType: String,
    disasterConfidence: Number,
    locationClues: [String],       // raw location mentions
    peopleCount: Number,
    vulnerableGroups: [String],    // ["children", "elderly"]
    urgencyKeywords: [String],
    scaleIndicators: [String]
  },
  
  // Resolved Data
  resolvedLocation: {
    name: String,                  // "KV Dhanbad"
    coordinates: { lat: Number, lng: Number },
    confidence: Number,
    buildingType: String,
    nearestResources: [{
      type: String,                // "fire_station", "hospital"
      name: String,
      distance: Number,
      eta: Number
    }]
  },
  
  // Scoring
  urgencyScore: Number,            // 0-100
  priority: String,                // "CRITICAL", "HIGH", "MEDIUM", "LOW"
  
  // Actions
  autoActions: [String],           // actions auto-triggered
  assignedTeam: ObjectId,
  
  timestamps: true
}
```

---

## 🤝 Contributing

We welcome contributions! Here's how:

1. **Fork** the repository
2. **Create** a feature branch (`git checkout -b feature/amazing-feature`)
3. **Commit** your changes (`git commit -m 'Add amazing feature'`)
4. **Push** to the branch (`git push origin feature/amazing-feature`)
5. **Open** a Pull Request

---

## 👥 Team

| Role | Responsibility |
|------|---------------|
| 🧠 Full-Stack Lead | Architecture, API, Database, WebSocket, Deployment |
| 🎨 Frontend Developer | React UI, PWA, Maps, Responsive Design, Accessibility |
| 🤖 AI/ML Developer | STT Pipeline, NLP, Tone Analysis, Location Resolver |
| 🎤 UI/UX + Presenter | Design, Demo Script, Pitch Presentation, Documentation |

---

<p align="center">
  <strong>Built with ❤️ for Hackatron 3.0 — BIT Sindri</strong><br/>
  <em>Because when disaster strikes, technology should bring people together, not leave them alone.</em>
</p>
